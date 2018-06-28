package com.zxn.event;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

//设置viewgroup中任意位置响应点击事件,其子控件不响应点击事件
@ContentView(R.layout.activity_view_group02)
public class ViewGroup2Activity extends AppCompatActivity {

    private String tag = "ViewGroupActivity";
    @ViewInject(R.id.root_ll)
    LinearLayout root_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle(getIntent().getStringExtra(MainActivity.TITLE));
    }

    @Event(value = {R.id.root_ll})
    private void onViewClick(View view) {
        switch (view.getId()) {
            case R.id.root_ll:
                Log.i(tag, "onViewGroup: --->");
                showToast("onViewGroup: --->");
                break;
        }
    }

    public void showToast(String text) {
        ToastUtil.showToast(text);
    }


}
