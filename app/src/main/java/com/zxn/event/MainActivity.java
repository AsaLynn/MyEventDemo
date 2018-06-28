package com.zxn.event;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.btn1)
    Button btn1;
    @ViewInject(R.id.btn2)
    Button btn2;
    @ViewInject(R.id.btn3)
    Button btn3;
    @ViewInject(R.id.btn4)
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle("Android事件分发机制");
        ToastUtil.init(this);
    }


    @Event(value = {R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4})
    private void onViewClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                click1();
                break;
            case R.id.btn2:
                click2();
                break;
            case R.id.btn3:
                click3();
                break;
            case R.id.btn4:
                click4();
                break;
        }
    }

    private void click4() {
        Intent intent = new Intent(this, ViewGroup2Activity.class);
        intent.putExtra(TITLE,btn4.getText().toString());
        startActivity(intent);
    }

    private void click2() {
        startActivity(new Intent(this,ViewActivity.class));
    }

    private void click1() {
        Intent intent = new Intent(this, ViewGroupActivity.class);
        intent.putExtra(TITLE,btn1.getText().toString());
        startActivity(intent);
    }

    private void click3() {
        Intent intent = new Intent(this, ViewGroup1Activity.class);
        intent.putExtra(TITLE,btn3.getText().toString());
        startActivity(intent);
    }

    public static String TITLE = "title";
}
