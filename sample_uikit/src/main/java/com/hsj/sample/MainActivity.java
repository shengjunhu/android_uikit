package com.hsj.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hsj.sample.seekbar.SeekBarActivity;
import com.hsj.sample.transition.Transition1Activity;

/**
 * @Author:hsj
 * @Date:2020-08-12
 * @Class:MainActivity
 * @Desc:功能列表
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_seek_bar).setOnClickListener(this);
        findViewById(R.id.btn_transition).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_seek_bar:
                startActivity(new Intent(this, SeekBarActivity.class));
                break;
            case R.id.btn_transition:
                startActivity(new Intent(this, Transition1Activity.class));
                break;
            default:
                break;
        }
    }
}