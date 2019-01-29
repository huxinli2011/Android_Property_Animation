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
import android.widget.TextView;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/13.
 */
public class setDurationInterpolatorActivity extends Activity {
    private TextView mTv1, mTv2;
    private AnimatorSet mAnimatorSet;

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
        tv1TranslateY.setDuration(500000000);
        tv1TranslateY.setInterpolator(new BounceInterpolator());//弹力

        ObjectAnimator tv2TranslateY = ObjectAnimator.ofFloat(mTv2, "translationY", 0, 400, 0);
        tv2TranslateY.setInterpolator(new AccelerateDecelerateInterpolator());//加速在加速

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(tv2TranslateY).with(tv1TranslateY);
        animatorSet.setDuration(2000);
        animatorSet.start();
        return animatorSet;
    }

}
