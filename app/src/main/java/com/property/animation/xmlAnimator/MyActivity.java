package com.property.animation.xmlAnimator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.property.animation.R;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_anim_main);
        /**
         * 在xml中与Animator对应的有三个标签
         * <animator/>:对应ValueAnimator
         * <objectAnimator/>:对应ObjectAnimator
         * <set/>:对应AnimatorSet
         */

        findViewById(R.id.value_anim_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ValueAnimXMLActivity.class));
            }
        });

        findViewById(R.id.object_anim_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ObjectAnimXmlActivity.class));
            }
        });

        findViewById(R.id.set_anim_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,SetAnimXMLActivity.class));
            }
        });
    }
}
