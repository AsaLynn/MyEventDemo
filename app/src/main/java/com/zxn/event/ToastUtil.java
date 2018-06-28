package com.zxn.event;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static Context mContext;

    public static void showToast(String text) {
        if (null == mContext){
            throw new RuntimeException("null == mContext");
        }
        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
    }

    public static void init(Context context) {
        mContext = context;
    }
}
