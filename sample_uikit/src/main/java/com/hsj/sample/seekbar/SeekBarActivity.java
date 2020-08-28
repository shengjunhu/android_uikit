package com.hsj.sample.seekbar;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.hsj.sample.R;
import com.hsj.widget.seekbar.SeekBars;

/**
 * @Author:hsj
 * @Date:2020-08-28
 * @Class:SeekBarActivity
 * @Desc:
 */
public class SeekBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        initUI();
    }

    private void initUI() {
        Context context = getApplicationContext();
        SeekBars sb_5 = findViewById(R.id.sb_5);
        sb_5.setCustomSectionTextArray((sectionCount, array) -> {
            array.clear();
            array.put(0, "start");
            array.put(3, "left");
            array.put(7, "right");
            array.put(10, "end");
            return array;
        });
        sb_5.setOnProgressChangedListener(new SeekBars.OnProgressChangedListenerAdapter() {
            @Override
            public void onProgressChanged(SeekBars seekBar, int progress, float progressFloat, boolean fromUser) {
                int color;
                if (progress <= 10) {
                    color = ContextCompat.getColor(context, R.color.colorRed);
                } else if (progress <= 40) {
                    color = ContextCompat.getColor(context, R.color.colorPink);
                } else if (progress <= 70) {
                    color = ContextCompat.getColor(context, R.color.colorOrange);
                } else if (progress <= 90) {
                    color = ContextCompat.getColor(context, R.color.colorBlue);
                } else {
                    color = ContextCompat.getColor(context, R.color.colorGreen);
                }
                seekBar.setSecondTrackColor(color);
                seekBar.setThumbColor(color);
                seekBar.setBubbleColor(color);
            }
        });
        sb_5.setProgress(60);
    }

}
