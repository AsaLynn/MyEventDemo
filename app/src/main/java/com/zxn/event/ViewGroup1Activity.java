package com.zxn.event;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;
//viewgroup拦截事件,不让子view接受收事件
@ContentView(R.layout.activity_view_group01)
public class ViewGroup1Activity extends AppCompatActivity {

    private String tag = "ViewGroupActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle(getIntent().getStringExtra(MainActivity.TITLE));
    }

    @Event(value = {R.id.btn1,R.id.btn2,R.id.root_ll})
    private void onViewClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                Log.i(tag, "onViewClick1: --->");
                String text = "onViewClick1: --->";
                showToast(text);
                break;
            case R.id.btn2:
                Log.i(tag, "onViewClick2: --->");
                showToast("onViewClick2: --->");
                break;
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
