package com.property.animation.PropertyAnimAdvance;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/15.
 */
public class ViewPropertyAnimatorActivity extends Activity {

    private TextView mTextView;
    private TextView mTextView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_property_anim_activity);

        mTextView = (TextView)findViewById(R.id.tv);
        mTextView2 = (TextView)findViewById(R.id.tv2);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mTextView.animate().scaleX(2);
                mTextView2.animate().scaleXBy(2);
            }
        });

        //虽然ViewPropertyAnimator不是继承自Animator,但是它仍允许我们设置Animator.AnimatorListener
        mTextView.animate().scaleX(2).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}
