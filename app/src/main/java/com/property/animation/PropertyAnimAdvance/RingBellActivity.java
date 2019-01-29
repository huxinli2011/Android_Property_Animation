package com.property.animation.PropertyAnimAdvance;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/15.
 */
public class RingBellActivity extends Activity {

    private ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ringbell_activity);

        mImg = (ImageView) findViewById(R.id.img);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Keyframe也可以使用插值器  frame.setInterpolator(new BounceInterpolator());
                //PropertyValuesHolder的其它函数，除了有ofInt(),ofFloat(),ofObject(),ofKeyframe()还有如下几个方法
                //1.setEvaluator() 设置动画的Evaluator
                //2.setFloatValues()用于设置ofFloat()所对应的动画值列表
                //3.setIntValues()用于设置ofInt()所对应的动画值列表
                //4.setKeyframes()设置ofKeyframe()所对应的动画值列表
                //5.setObjectValues(Object... values)用于设置ofObject()所对应的动画值列表
                //6.setPropertyName()设置动画属性名


                /**
                 * 左右震动效果
                 */
                Keyframe frame0 = Keyframe.ofFloat(0f, 0);
                Keyframe frame1 = Keyframe.ofFloat(0.1f, -20f);
                Keyframe frame2 = Keyframe.ofFloat(0.2f, 20f);
                Keyframe frame3 = Keyframe.ofFloat(0.3f, -20f);
                Keyframe frame4 = Keyframe.ofFloat(0.4f, 20f);
                Keyframe frame5 = Keyframe.ofFloat(0.5f, -20f);
                Keyframe frame6 = Keyframe.ofFloat(0.6f, 20f);
                Keyframe frame7 = Keyframe.ofFloat(0.7f, -20f);
                Keyframe frame8 = Keyframe.ofFloat(0.8f, 20f);
                Keyframe frame9 = Keyframe.ofFloat(0.9f, -20f);
                Keyframe frame10 = Keyframe.ofFloat(1, 0);
                PropertyValuesHolder frameHolder1 = PropertyValuesHolder.ofKeyframe("rotation", frame0, frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9, frame10);


                /**
                 * scaleX放大1.1倍
                 */
                Keyframe scaleXframe0 = Keyframe.ofFloat(0f, 1);
                Keyframe scaleXframe1 = Keyframe.ofFloat(0.1f, 1.1f);
                Keyframe scaleXframe9 = Keyframe.ofFloat(0.9f, 1.1f);
                Keyframe scaleXframe10 = Keyframe.ofFloat(1, 1);
                PropertyValuesHolder frameHolder2 = PropertyValuesHolder.ofKeyframe("ScaleX", scaleXframe0, scaleXframe1, scaleXframe9, scaleXframe10);


                /**
                 * scaleY放大1.1倍
                 */
                Keyframe scaleYframe0 = Keyframe.ofFloat(0f, 1);
                Keyframe scaleYframe1 = Keyframe.ofFloat(0.1f, 1.1f);
                Keyframe scaleYframe9 = Keyframe.ofFloat(0.9f, 1.1f);
                Keyframe scaleYframe10 = Keyframe.ofFloat(1, 1);
                PropertyValuesHolder frameHolder3 = PropertyValuesHolder.ofKeyframe("ScaleY", scaleYframe0, scaleYframe1, scaleYframe9, scaleYframe10);

                /**
                 * 构建动画
                 */
                Animator animator = ObjectAnimator.ofPropertyValuesHolder(mImg, frameHolder1, frameHolder2, frameHolder3);
                animator.setDuration(1000);
                animator.start();
            }
        });
    }
}
