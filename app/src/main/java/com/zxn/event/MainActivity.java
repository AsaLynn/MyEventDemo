package com.zxn.event;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }


    @Event(value = {R.id.btn1,R.id.btn2})
    private void onViewClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                startActivity(new Intent(this,ViewGroupActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this,ViewActivity.class));
                break;
        }
    }
}
