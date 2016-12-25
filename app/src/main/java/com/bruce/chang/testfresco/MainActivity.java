package com.bruce.chang.testfresco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_fresco_spimg, bt_fresco_crop, bt_fresco_circleAndCorner, bt_fresco_jpeg, bt_fresco_gif, bt_fresco_multi, bt_fresco_listener, bt_fresco_resize, bt_fresco_modifyImg, bt_fresco_autoSizeImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewAndListener();

    }

    private void initViewAndListener() {
        bt_fresco_spimg = (Button) findViewById(R.id.bt_fresco_spimg);
        bt_fresco_spimg.setOnClickListener(this);
        bt_fresco_crop = (Button) findViewById(R.id.bt_fresco_crop);
        bt_fresco_crop.setOnClickListener(this);
        bt_fresco_circleAndCorner = (Button) findViewById(R.id.bt_fresco_circleAndCorner);
        bt_fresco_circleAndCorner.setOnClickListener(this);
        bt_fresco_jpeg = (Button) findViewById(R.id.bt_fresco_jpeg);
        bt_fresco_jpeg.setOnClickListener(this);
        bt_fresco_gif = (Button) findViewById(R.id.bt_fresco_gif);
        bt_fresco_gif.setOnClickListener(this);
        bt_fresco_multi = (Button) findViewById(R.id.bt_fresco_multi);
        bt_fresco_multi.setOnClickListener(this);
        bt_fresco_listener = (Button) findViewById(R.id.bt_fresco_listener);
        bt_fresco_listener.setOnClickListener(this);
        bt_fresco_resize = (Button) findViewById(R.id.bt_fresco_resize);
        bt_fresco_resize.setOnClickListener(this);
        bt_fresco_modifyImg = (Button) findViewById(R.id.bt_fresco_modifyImg);
        bt_fresco_modifyImg.setOnClickListener(this);
        bt_fresco_autoSizeImg = (Button) findViewById(R.id.bt_fresco_autoSizeImg);
        bt_fresco_autoSizeImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_fresco_spimg:
                break;
            case R.id.bt_fresco_crop:
                break;
            case R.id.bt_fresco_circleAndCorner:
                break;
            case R.id.bt_fresco_jpeg:
                break;
            case R.id.bt_fresco_gif:
                break;
            case R.id.bt_fresco_multi:
                break;
            case R.id.bt_fresco_listener:
                break;
            case R.id.bt_fresco_resize:
                break;
            case R.id.bt_fresco_modifyImg:
                break;
            case R.id.bt_fresco_autoSizeImg:
                break;
            default:
                break;

        }
    }
}
