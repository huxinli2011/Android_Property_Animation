package com.property.animation.ViewGroupAnim;

import android.animation.Keyframe;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/18.
 */
public class LayoutTransitionActivity extends Activity {
    private LinearLayout linearLayoutContainer;

    private int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animate_layout_changes_activity);
        linearLayoutContainer = (LinearLayout) findViewById(R.id.linearlayoutcontainer);
        //第一步：创建实例
        LayoutTransition transition = new LayoutTransition();
        //第二步：创建动画并设置  入场动画:view在这个容器中消失时触发的动画
        ObjectAnimator animIn = ObjectAnimator.ofFloat(null, "rotationY", 0f, 360f, 0f);
        transition.setAnimator(LayoutTransition.APPEARING, animIn);//LayoutTransition.APPEARING指用于添加时的动画

        //出场动画:view显示时的动画
        ObjectAnimator animOut = ObjectAnimator.ofFloat(null, "rotation", 0f, 90f, 0f);
        transition.setAnimator(LayoutTransition.DISAPPEARING, animOut);//LayoutTransition.DISAPPEARING指控件被删除时的动画
        //第三步：将LayoutTransition设置到ViewGroup中
        linearLayoutContainer.setLayoutTransition(transition);


        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addButtonView();
            }
        });
        findViewById(R.id.remove_btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                removeButtonView();
            }
        });

        //LayoutTransition的其它函数
        /**
         * 1、设置所有动画完成需要的时长
         * setDuration(long dd)
         * 2、针对单个Type设置动画时长 APPEARING,DISAPPEARING,CHANGE_APPEARING,CHANGE_DISAPPEARING
         * setDuration(int transitionType,long duration)
         * 3、针对单个Type设置插值器
         * setInterpolator(int transitionType,TimeInterpolator interpolator)
         * 4、针对单个Type设置动画延时
         * setStartDelay(int transitionType,long delay)
         * 5、针对单个Type设置每个子item动画的时间间隔
         * setStagger(int transigionType,long duration)
         *
         * LayoutTransition 还提供了一个监听函数
         * addTransitionListener(TransitionListener listener)
         */
    }

    private void addButtonView() {
        i++;
        Button button = new Button(this);
        button.setText("button" + i);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        button.setLayoutParams(params);
        linearLayoutContainer.addView(button, 0);
    }

    private void removeButtonView() {
        if (i > 0) {
            linearLayoutContainer.removeViewAt(0);
        }
        i--;
    }

}
