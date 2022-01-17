package com.hsj.sample.transition;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.animation.PathInterpolatorCompat;

import com.hsj.sample.R;
import com.hsj.widget.transition.TransitionCallback;
import com.hsj.widget.transition.TransitionController;
import com.hsj.widget.transition.TransitionParam;
import com.hsj.widget.transition.TransitionUtils;

/**
 * @Author:hsj
 * @Date:2020-08-12
 * @Class:Transition2Activity
 * @Desc:如图片列表、视频列表进入的界面
 */
public final class Transition2Activity extends AppCompatActivity {

    private static final String TRANSITION_PARAM = "transition_param";
    private TransitionController transitionController;
    private TransitionParam transitionParam;

    public static void intentStart(Context context, TransitionParam param) {
        Intent intent = new Intent(context, Transition2Activity.class);
        intent.putExtra(TRANSITION_PARAM, param);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusBar();
        setContentView(R.layout.activity_video_play);
        initUI();
    }

    private void setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    private void initUI() {
        transitionParam = getIntent().getParcelableExtra(TRANSITION_PARAM);
        transitionController = new TransitionController.Builder()
                .with(findViewById(R.id.fl_root))
                .setInterpolator(PathInterpolatorCompat.create(0.32F, 0.94F, 0.6F, 1.0F))
                .duration(320)
                .build();
        transitionController.transitionEnter(transitionParam, new TransitionCallback() {
            @Override
            public void onTransitionStop() {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (transitionController != null) {
            transitionController.transitionRelease();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            if (transitionParam != null) {
                transitionController.transitionExit(this::finish);
            } else {
                finish();
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void finish() {
        super.finish();
        TransitionUtils.finishTransition(this);
    }

}