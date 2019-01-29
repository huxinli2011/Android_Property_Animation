package com.property.animation.PropertyAnimAdvance;

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
        setContentView(R.layout.property_anim_advance_main);

        findViewById(R.id.of_int_float_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ofIntFloatActivity.class));
            }
        });

        findViewById(R.id.of_object_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ofObjectActivity.class));
            }
        });

        findViewById(R.id.ring_bell_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,RingBellActivity.class));
            }
        });
    }
}
