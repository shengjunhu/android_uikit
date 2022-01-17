package com.hsj.widget.transition;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;

import com.hsj.widget.R;

/**
 * @Author:hsj
 * @Date:2020-06-28
 * @Class:TransitionUtils
 * @Desc:
 */
public final class TransitionUtils {

    /**
     * 获取源View的数据
     *
     * @param sourceView
     * @return
     */
    public static TransitionParam getSourceViewParam(View sourceView) {
        if (sourceView == null) {
            throw new NullPointerException("source view is null");
        } else {
            int width = sourceView.getMeasuredWidth();
            int height = sourceView.getMeasuredHeight();
            if (width > 0 && height > 0) {
                //宽高都有效
                TransitionParam animBean = new TransitionParam();
                animBean.width = width;
                animBean.height = height;
                Rect visibleRect = new Rect();
                sourceView.getGlobalVisibleRect(visibleRect);

                animBean.left = visibleRect.left;
                animBean.right = visibleRect.right;
                animBean.top = visibleRect.top;
                animBean.bottom = visibleRect.bottom;
                return animBean;
            }
        }
        return null;
    }

    public static void finishTransition(Activity activity) {
        if (activity != null) {
            activity.overridePendingTransition(R.anim.transition_fade_in, R.anim.transition_fade_out);
        }
    }

}
