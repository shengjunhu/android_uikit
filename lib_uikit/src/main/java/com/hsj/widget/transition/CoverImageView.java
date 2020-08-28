package com.hsj.widget.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/**
 * @Author:hsj
 * @Date:2020-08-12
 * @Class:VideoCoverImageView
 * @Desc:视频封面
 */
@SuppressLint("AppCompatCustomView")
public final class CoverImageView extends ImageView {

    public CoverImageView(Context context) {
        this(context,null);
    }

    public CoverImageView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CoverImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        //测试直接硬编码,下一个页面是全屏显示
        Rect location = new Rect();
        View rootView = (View) getParent();
        rootView.getGlobalVisibleRect(location);
        int height = (int) ((float) width / location.right * location.bottom);
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY));
    }

}
