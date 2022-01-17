package com.hsj.widget.seekbar;

import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;

public class ConfigBuilder {

    float min;
    float max;
    float progress;
    boolean floatType;
    int trackSize;
    int secondTrackSize;
    int thumbRadius;
    int thumbRadiusOnDragging;
    int trackColor;
    int secondTrackColor;
    int thumbColor;
    int sectionCount;
    boolean showSectionMark;
    boolean autoAdjustSectionMark;
    boolean showSectionText;
    int sectionTextSize;
    int sectionTextColor;
    @SeekBars.TextPosition
    int sectionTextPosition;
    int sectionTextInterval;
    boolean showThumbText;
    int thumbTextSize;
    int thumbTextColor;
    boolean showProgressInFloat;
    long animDuration;
    boolean touchToSeek;
    boolean seekStepSection;
    boolean seekBySection;
    int bubbleColor;
    int bubbleTextSize;
    int bubbleTextColor;
    boolean alwaysShowBubble;
    long alwaysShowBubbleDelay;
    boolean hideBubble;
    boolean rtl;

    private SeekBars mSeekBars;

    ConfigBuilder(SeekBars seekBars) {
        mSeekBars = seekBars;
    }

    public void build() {
        mSeekBars.config(this);
    }

    public ConfigBuilder min(float min) {
        this.min = min;
        this.progress = min;
        return this;
    }

    public ConfigBuilder max(float max) {
        this.max = max;
        return this;
    }

    public ConfigBuilder progress(float progress) {
        this.progress = progress;
        return this;
    }

    public ConfigBuilder floatType() {
        this.floatType = true;
        return this;
    }

    public ConfigBuilder trackSize(int dp) {
        this.trackSize = SeekBarsUtils.dp2px(dp);
        return this;
    }

    public ConfigBuilder secondTrackSize(int dp) {
        this.secondTrackSize = SeekBarsUtils.dp2px(dp);
        return this;
    }

    public ConfigBuilder thumbRadius(int dp) {
        this.thumbRadius = SeekBarsUtils.dp2px(dp);
        return this;
    }

    public ConfigBuilder thumbRadiusOnDragging(int dp) {
        this.thumbRadiusOnDragging = SeekBarsUtils.dp2px(dp);
        return this;
    }

    public ConfigBuilder trackColor(@ColorInt int color) {
        this.trackColor = color;
        this.sectionTextColor = color;
        return this;
    }

    public ConfigBuilder secondTrackColor(@ColorInt int color) {
        this.secondTrackColor = color;
        this.thumbColor = color;
        this.thumbTextColor = color;
        this.bubbleColor = color;
        return this;
    }

    public ConfigBuilder thumbColor(@ColorInt int color) {
        this.thumbColor = color;
        return this;
    }

    public ConfigBuilder sectionCount(@IntRange(from = 1) int count) {
        this.sectionCount = count;
        return this;
    }

    public ConfigBuilder showSectionMark() {
        this.showSectionMark = true;
        return this;
    }

    public ConfigBuilder autoAdjustSectionMark() {
        this.autoAdjustSectionMark = true;
        return this;
    }

    public ConfigBuilder showSectionText() {
        this.showSectionText = true;
        return this;
    }

    public ConfigBuilder sectionTextSize(int sp) {
        this.sectionTextSize = SeekBarsUtils.sp2px(sp);
        return this;
    }

    public ConfigBuilder sectionTextColor(@ColorInt int color) {
        this.sectionTextColor = color;
        return this;
    }

    public ConfigBuilder sectionTextPosition(@SeekBars.TextPosition int position) {
        this.sectionTextPosition = position;
        return this;
    }

    public ConfigBuilder sectionTextInterval(@IntRange(from = 1) int interval) {
        this.sectionTextInterval = interval;
        return this;
    }

    public ConfigBuilder showThumbText() {
        this.showThumbText = true;
        return this;
    }

    public ConfigBuilder thumbTextSize(int sp) {
        this.thumbTextSize = SeekBarsUtils.sp2px(sp);
        return this;
    }

    public ConfigBuilder thumbTextColor(@ColorInt int color) {
        thumbTextColor = color;
        return this;
    }

    public ConfigBuilder showProgressInFloat() {
        this.showProgressInFloat = true;
        return this;
    }

    public ConfigBuilder animDuration(long duration) {
        animDuration = duration;
        return this;
    }

    public ConfigBuilder touchToSeek() {
        this.touchToSeek = true;
        return this;
    }

    public ConfigBuilder seekStepSection() {
        this.seekStepSection = true;
        return this;
    }

    public ConfigBuilder seekBySection() {
        this.seekBySection = true;
        return this;
    }

    public ConfigBuilder bubbleColor(@ColorInt int color) {
        this.bubbleColor = color;
        return this;
    }

    public ConfigBuilder bubbleTextSize(int sp) {
        this.bubbleTextSize = SeekBarsUtils.sp2px(sp);
        return this;
    }

    public ConfigBuilder bubbleTextColor(@ColorInt int color) {
        this.bubbleTextColor = color;
        return this;
    }

    public ConfigBuilder alwaysShowBubble() {
        this.alwaysShowBubble = true;
        return this;
    }

    public ConfigBuilder alwaysShowBubbleDelay(long delay) {
        alwaysShowBubbleDelay = delay;
        return this;
    }

    public ConfigBuilder hideBubble() {
        this.hideBubble = true;
        return this;
    }

    public ConfigBuilder rtl(boolean rtl) {
        this.rtl = rtl;
        return this;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public float getProgress() {
        return progress;
    }

    public boolean isFloatType() {
        return floatType;
    }

    public int getTrackSize() {
        return trackSize;
    }

    public int getSecondTrackSize() {
        return secondTrackSize;
    }

    public int getThumbRadius() {
        return thumbRadius;
    }

    public int getThumbRadiusOnDragging() {
        return thumbRadiusOnDragging;
    }

    public int getTrackColor() {
        return trackColor;
    }

    public int getSecondTrackColor() {
        return secondTrackColor;
    }

    public int getThumbColor() {
        return thumbColor;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public boolean isShowSectionMark() {
        return showSectionMark;
    }

    public boolean isAutoAdjustSectionMark() {
        return autoAdjustSectionMark;
    }

    public boolean isShowSectionText() {
        return showSectionText;
    }

    public int getSectionTextSize() {
        return sectionTextSize;
    }

    public int getSectionTextColor() {
        return sectionTextColor;
    }

    public int getSectionTextPosition() {
        return sectionTextPosition;
    }

    public int getSectionTextInterval() {
        return sectionTextInterval;
    }

    public boolean isShowThumbText() {
        return showThumbText;
    }

    public int getThumbTextSize() {
        return thumbTextSize;
    }

    public int getThumbTextColor() {
        return thumbTextColor;
    }

    public boolean isShowProgressInFloat() {
        return showProgressInFloat;
    }

    public long getAnimDuration() {
        return animDuration;
    }

    public boolean isTouchToSeek() {
        return touchToSeek;
    }

    public boolean isSeekStepSection() {
        return seekStepSection;
    }

    public boolean isSeekBySection() {
        return seekBySection;
    }

    public int getBubbleColor() {
        return bubbleColor;
    }

    public int getBubbleTextSize() {
        return bubbleTextSize;
    }

    public int getBubbleTextColor() {
        return bubbleTextColor;
    }

    public boolean isAlwaysShowBubble() {
        return alwaysShowBubble;
    }

    public long getAlwaysShowBubbleDelay() {
        return alwaysShowBubbleDelay;
    }

    public boolean isHideBubble() {
        return hideBubble;
    }

    public boolean isRtl() {
        return rtl;
    }
}
