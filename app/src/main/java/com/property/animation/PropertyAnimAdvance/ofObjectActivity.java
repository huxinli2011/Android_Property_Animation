package com.property.animation.PropertyAnimAdvance;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/15.
 */
public class ofObjectActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private MyTextView mMyTv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ofobject_activity);

        mMyTv = (MyTextView) findViewById(R.id.mytv);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /**
                 * ofObject使用
                 */
                PropertyValuesHolder charHolder = PropertyValuesHolder.ofObject("CharText",new CharEvaluator(),new Character('A'),new Character('Z'));
                ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(mMyTv, charHolder);
                animator.setDuration(3000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();


                /**
                 * 使用KeyFrame改变文字
                 */
//                Keyframe frame0 = Keyframe.ofObject(0f, new Character('A'));
//                Keyframe frame1 = Keyframe.ofObject(0.1f, new Character('L'));
//                Keyframe frame2 = Keyframe.ofObject(1,new Character('Z'));
//
//                PropertyValuesHolder frameHolder = PropertyValuesHolder.ofKeyframe("CharText",frame0,frame1,frame2);
//                frameHolder.setEvaluator(new CharEvaluator());
//                ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(mMyTv,frameHolder);
//                animator.setDuration(3000);
//                animator.start();

            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /**
                 * 使用KeyFrame改变文字
                 */
                Keyframe frame0 = Keyframe.ofObject(0f, new Character('A'));//两个参数，1.fraction:表示当前的显示进度，即在插值器中getInterpolation()函数的返回值。2.value表示动画当前所在的数值位置。
                Keyframe frame1 = Keyframe.ofObject(0.1f, new Character('L'));
                Keyframe frame2 = Keyframe.ofObject(1,new Character('Z'));

                PropertyValuesHolder frameHolder = PropertyValuesHolder.ofKeyframe("CharText",frame0,frame1,frame2);
                frameHolder.setEvaluator(new CharEvaluator());
                ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(mMyTv,frameHolder);
                animator.setDuration(3000);
                animator.start();

            }
        });
    }
}
