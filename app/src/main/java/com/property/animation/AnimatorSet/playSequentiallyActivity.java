package com.property.animation.AnimatorSet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/12.
 */
public class playSequentiallyActivity extends Activity {
    private Button mButton;
    private TextView mTv1, mTv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_sequentially_activity);

        mButton = (Button) findViewById(R.id.btn);
        Button mButton2 = (Button) findViewById(R.id.btn2);
        Button mButton3 = (Button) findViewById(R.id.btn3);
        mTv1 = (TextView) findViewById(R.id.tv_1);
        mTv2 = (TextView) findViewById(R.id.tv_2);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /**
                 * playSequentially
                 */
                ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(mTv1, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
                ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(mTv1, "translationY", 0, 300, 0);
                ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);

                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(tv1BgAnimator, tv1TranslateY, tv2TranslateY);
                animatorSet.setDuration(1000);
                animatorSet.start();

                /**
                 * playTogether
                 */
//                ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(mTv1, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
//                ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(mTv1, "translationY", 0, 400, 0);
//                ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);
//
//                AnimatorSet animatorSet = new AnimatorSet();
//                animatorSet.playTogether(tv1BgAnimator, tv1TranslateY, tv2TranslateY);
//                animatorSet.setDuration(1000);
//                animatorSet.start();

                /**
                 * 使用AnimatorSet.builder
                 */
//                ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(mTv1, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
//                ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(mTv1, "translationY", 0, 400, 0);
//                ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);
//
//                AnimatorSet animatorSet = new AnimatorSet();
//                animatorSet.play(tv1TranslateY).with(tv2TranslateY).after(tv1BgAnimator);
//                animatorSet.setDuration(2000);
//                animatorSet.start();


            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /**
                 * playTogether
                 */
                ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(mTv1, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
                ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(mTv1, "translationY", 0, 400, 0);
                ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);

                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(tv1BgAnimator, tv1TranslateY, tv2TranslateY);
                animatorSet.setDuration(1000);
                animatorSet.start();
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /**
                 * 使用AnimatorSet.builder
                 */
                ObjectAnimator tv1BgAnimator = ObjectAnimator.ofInt(mTv1, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
                ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(mTv1, "translationY", 0, 400, 0);
                ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);

                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(tv1TranslateY).with(tv2TranslateY).after(tv1BgAnimator);
                //play表示要播放的动画，with和前面动画一起执行，before先执行这个动画再执行前面的动画，after(Animator anim)在执行前面的动画后才执行该动画，after(long delay)延时n毫秒后执行动画
                animatorSet.setDuration(2000);
                animatorSet.start();
            }
        });
    }
}
