package com.property.animation.ViewGroupAnim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.property.animation.R;

import java.util.ArrayList;
import java.util.List;
//详解看这里 https://blog.csdn.net/harvic880925/article/details/50785786
public class ListViewLayoutAnimation extends Activity {
    private ListView mListView;
    private ArrayAdapter mAdapter;
    private Button mAddListBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout_anim);

        mListView = (ListView) findViewById(R.id.listview);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData());
        mListView.setAdapter(mAdapter);

        mAddListBtn = (Button)findViewById(R.id.addlist);
        mAddListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.addAll(getData());
            }
        });

        //第二种方案：代码设置通过加载XML动画设置文件来创建一个Animation对象；
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.slide_in_left);   //得到一个LayoutAnimationController对象；
//        LayoutAnimationController controller = new LayoutAnimationController(animation);   //设置控件显示的顺序；
//        controller.setOrder(LayoutAnimationController.ORDER_REVERSE);   //设置控件显示间隔时间；
//        controller.setDelay(0.3f);   //为ListView设置LayoutAnimationController属性；
//        mListView.setLayoutAnimation(controller);
//        mListView.startLayoutAnimation();
    }

    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");

        return data;
    }

}
