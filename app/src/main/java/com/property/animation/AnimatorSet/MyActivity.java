package com.property.animation.AnimatorSet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.property.animation.R;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animator_set_main);

        findViewById(R.id.animator_set_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,playSequentiallyActivity.class));
            }
        });

        findViewById(R.id.animator_listener_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, AnimatorListenerActivity.class));
            }
        });

        findViewById(R.id.animator_duration_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, setDurationInterpolatorActivity.class));
            }
        });

        findViewById(R.id.animator_target_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, setTargetActivity.class));
            }
        });
        findViewById(R.id.animator_start_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, setStartDelayActivity.class));
            }
        });

        findViewById(R.id.path_menu_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, PathMenuActivity.class));
            }
        });
    }
}
