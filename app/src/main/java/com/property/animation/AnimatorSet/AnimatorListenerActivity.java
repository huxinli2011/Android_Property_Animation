package com.property.animation.AnimatorSet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/13.
 */
public class AnimatorListenerActivity extends Activity {
    private TextView mTv1, mTv2;
    private AnimatorSet mAnimatorSet;
    private String tag="qijian";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animator_listener_activity);

        mTv1 = (TextView) findViewById(R.id.tv_1);
        mTv2 = (TextView) findViewById(R.id.tv_2);


        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mAnimatorSet = doListenerAnimation();
            }
        });

        findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (null != mAnimatorSet) {
                    mAnimatorSet.cancel();
                }
            }
        });
    }

    private AnimatorSet doListenerAnimation() {
        ObjectAnimator tv1TranslateY = ObjectAnimator.ofFloat(mTv1, "translationY", 0, 400, 0);
        ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);
        tv2TranslateY.setRepeatCount(ValueAnimator.INFINITE);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(tv1TranslateY).with(tv2TranslateY);
        animatorSet.addListener(new Animator.AnimatorListener() {
            public void onAnimationStart(Animator animation) {
                Log.d(tag, "animator start");
            }

            public void onAnimationEnd(Animator animation) {
                Log.d(tag, "animator end");
            }

            public void onAnimationCancel(Animator animation) {
                Log.d(tag, "animator cancel");
            }

            public void onAnimationRepeat(Animator animation) {
                Log.d(tag, "animator repeat");
            }
        });
        animatorSet.setDuration(2000);
        animatorSet.start();
        return animatorSet;
        //AnimatorSet监听器的总结
        //1.AnimatorSet的监听函数只是用来监听AnimatorSet的状态的，与其中的动画无关
        //2.AnimatorSet中并没有设置循环的函数，所以动画执行一次就结束了，永远无法执行到onAnimationRepeat()
    }

}
