package com.property.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ValueAnimator(View view) {
        startActivity(new Intent(this,com.property.animation.ValueAnimator.MyActivity.class));
    }

    public void InterploatorEvaluator(View view) {
        startActivity(new Intent(this,com.property.animation.InterploatorEvaluator.MyActivity.class));
    }

    public void ObjectAnimator(View view) {
        startActivity(new Intent(this,com.property.animation.ObjectAnimator.MyActivity.class));
    }

    public void AnimatorSet(View view) {
        startActivity(new Intent(this,com.property.animation.AnimatorSet.MyActivity.class));
    }

    public void xmlAnimator(View view) {
        startActivity(new Intent(this,com.property.animation.xmlAnimator.MyActivity.class));
    }


    //属性动画进阶
    public void PropertyAnimAdvance(View view) {
        startActivity(new Intent(this,com.property.animation.PropertyAnimAdvance.MyActivity.class));
    }

    public void ViewProperAnimator(View view) {
        startActivity(new Intent(this,com.property.animation.PropertyAnimAdvance.ViewPropertyAnimatorActivity.class));
    }

    public void ViewGroupAnim(View view) {
        startActivity(new Intent(this,com.property.animation.ViewGroupAnim.MyActivity.class));
    }

    public void nineOldAndroidsDemo(View view) {
        startActivity(new Intent(this,com.property.animation.nineOldAndroidsDemo.MyActivity.class));
    }

    //动画进阶
    public void PathMeasureDemo(View view) {
        startActivity(new Intent(this,com.property.animation.PathMeasureDemo.MyActivity.class));
    }

    public void SvgDemo(View view) {
        startActivity(new Intent(this,com.property.animation.svgdemo.MainActivity.class));
    }
}
