package com.zxn.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

@ContentView(R.layout.activity_view_group)
public class ViewGroupActivity extends AppCompatActivity {

    private String tag = "ViewGroupActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(value = {R.id.btn1,R.id.btn2,R.id.root_ll})
    private void onViewClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                Log.i(tag, "onViewClick1: --->");
                break;
            case R.id.btn2:
                Log.i(tag, "onViewClick2: --->");
                break;
            case R.id.root_ll:
                Log.i(tag, "onViewGroup: --->");
                break;
        }
    }
}
