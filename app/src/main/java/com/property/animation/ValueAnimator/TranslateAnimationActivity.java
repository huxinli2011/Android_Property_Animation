package com.property.animation.ValueAnimator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.property.animation.R;

/**
 * Created by qijian on 16/12/3.
 */
public class TranslateAnimationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.translate_anim_activity);
        final TextView tv=(TextView)findViewById(R.id.tv);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TranslateAnimation animation=new TranslateAnimation(Animation.ABSOLUTE,0,Animation.ABSOLUTE,400
                ,Animation.ABSOLUTE,0,Animation.ABSOLUTE,100);
                animation.setFillAfter(true);
                animation.setDuration(1000);
                tv.startAnimation(animation);

            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TranslateAnimationActivity.this,"click me",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
