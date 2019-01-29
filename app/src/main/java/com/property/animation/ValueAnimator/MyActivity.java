package com.property.animation.ValueAnimator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.property.animation.R;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.value_anim_main);

        Button btn  = (Button)findViewById(R.id.translate_anim);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,TranslateAnimationActivity.class));
            }
        });

        findViewById(R.id.value_anim_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ValueAnimDemoActivity.class));
            }
        });
        findViewById(R.id.value_repeat).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,RepeatActivity.class));
            }
        });

        findViewById(R.id.loading_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,LoadingDemoActivity.class));
            }
        });




    }
}
