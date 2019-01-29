package com.property.animation.ViewGroupAnim;

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
        setContentView(R.layout.viewgroup_main);

        findViewById(R.id.layoutAnimation).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ListViewLayoutAnimation.class));
            }
        });
        findViewById(R.id.gridLayoutAnimation).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,GridViewLayoutAnimation.class));
            }
        });
        findViewById(R.id.animateLayoutChangesActivity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,AnimateLayoutChangesActivity.class));
            }
        });
        findViewById(R.id.LayoutTransitionActivity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,LayoutTransitionActivity.class));
            }
        });
        findViewById(R.id.LayoutTransitionKeyframeActivity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,LayoutTransitionKeyframeActivity.class));
            }
        });
    }
}
