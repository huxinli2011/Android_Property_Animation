package com.property.animation.ViewGroupAnim;

import android.animation.*;
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
 * 本例说明：只需要在ViewGroup的xml中添加一行代码android:animateLayoutChanges=true即可以实现内部控件在添加或删除时都带有默认的动画效果，
 * 但是android:animateLayoutChanges这个属性不能自定义
 */
public class AnimateLayoutChangesActivity extends Activity {
    private LinearLayout linearLayoutContainer;

    private int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animate_layout_changes_activity);
        linearLayoutContainer = (LinearLayout) findViewById(R.id.linearlayoutcontainer);



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
