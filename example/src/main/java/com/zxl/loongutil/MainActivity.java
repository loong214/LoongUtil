package com.zxl.loongutil;

import android.app.Activity;
import android.os.Bundle;

import com.zxl.utillib.T;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T.showShort(this,"哈哈");
    }
}
