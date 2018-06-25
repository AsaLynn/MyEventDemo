package com.zxn.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_view)
public class ViewActivity extends AppCompatActivity {
    @ViewInject(R.id.btn1)
    Button button1;
    private String tag = "ViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(tag, "onTouch: --->"+event.getAction());
                return true;
            }
        });
    }

    @Event(value = {R.id.btn1,R.id.btn2})
    private void onViewClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                Log.i(tag, "onViewClick1: --->");
                break;
            case R.id.btn2:

                break;
        }
    }
}
