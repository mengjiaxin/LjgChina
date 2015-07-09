package com.ljgchina.material;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }

    private void init() {
        mImageView = (ImageView) findViewById(R.id.id_logo_imageview);
        KeyboardLayout mainView = (KeyboardLayout) findViewById(R.id.keyboardLayout1);
        mainView.setOnkbdStateListener(new KeyboardLayout.onKybdsChangeListener() {
            @Override
            public void onKeyBoardStateChange(int state) {
                switch (state) {
                    case KeyboardLayout.KEYBOARD_STATE_HIDE:
                        Toast.makeText(MainActivity.this, "软键盘隐藏", Toast.LENGTH_SHORT).show();
                        mImageView.setVisibility(View.VISIBLE);
                        break;
                    case KeyboardLayout.KEYBOARD_STATE_SHOW:
                        Toast.makeText(MainActivity.this, "软键盘显示", Toast.LENGTH_SHORT).show();
                        mImageView.setVisibility(View.GONE);
                        break;
                }
            }
        });
    }


}
