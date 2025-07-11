package org.telegram.ui.Components;

import android.content.Context;

import org.telegram.ui.ActionBar.SimpleTextView;

public class SelfMeasuringTextView extends SimpleTextView {
    public float width = 0;
    public float height = 0;
    boolean measureOnce = false;
    boolean inited = false;

    public SelfMeasuringTextView(Context context) {
        super(context);
    }

    public SelfMeasuringTextView(Context context, boolean measureOnce) {
        super(context);
        this.measureOnce = measureOnce;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        // the inited flag is here to avoid an infinite loop of
        // measuring and editing the text over and over again
        if (!measureOnce || !inited) {
            width = right - left;
            inited = true;
        }
    }

}
