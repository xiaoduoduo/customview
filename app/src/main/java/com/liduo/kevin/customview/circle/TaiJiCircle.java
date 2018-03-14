package com.liduo.kevin.customview.circle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by liduo on 2017/10/31.
 */

public class TaiJiCircle extends View {
    private Paint whitePaint, blackPaint;
    private int height, width;

    public TaiJiCircle(Context context) {
        super(context);
        init();
    }

    public TaiJiCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        whitePaint = new Paint();
        whitePaint.setStrokeWidth(5);
        whitePaint.setStyle(Paint.Style.FILL);
        whitePaint.setColor(Color.WHITE);
        whitePaint.setAntiAlias(true);

        blackPaint = new Paint();
        blackPaint.setStrokeWidth(5);
        blackPaint.setStyle(Paint.Style.FILL);
        blackPaint.setColor(Color.BLACK);
        blackPaint.setAntiAlias(true);

    }

    /**
     * 可以使用两种方式获取宽高
     *
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        height = h;
        width = w;
        Log.i("TaiJiCircle", "height:" + height + " width:" + width);
        Log.i("TaiJiCircle", "height:" + getHeight() + " width:" + getWidth());
    }


    @Override
    protected void onDraw(Canvas canvas) {
        // 移动画布
        canvas.translate(width / 2, height / 2);
//        canvas.rotate(degrees);

        float r = (float) (Math.min(width, height) / 2 * 0.8);
        // 绘制圆
        canvas.drawCircle(0, 0, r, blackPaint);
        RectF rectF = new RectF(-r + 2, -r + 2, r - 2, r - 2);

        // 绘制半圆
        canvas.drawArc(rectF, -90, 180, true, whitePaint);
        canvas.drawArc(rectF, 90, 180, true, blackPaint);

        // 绘制分割圆
        RectF rectLeft = new RectF(-r / 2 + 1, -r + 2, r / 2 - 1, 0);
        RectF rectRight = new RectF(-r / 2 + 1, 0, r / 2 - 1, r - 2);

        canvas.drawArc(rectLeft, 90, 180, true, whitePaint);
        canvas.drawArc(rectRight, -90, 180, true, blackPaint);

        // 绘制上下小圆
        canvas.drawCircle(0, -r / 2 + 1, r / 6, blackPaint);
        canvas.drawCircle(0, r / 2 - 1, r / 6, whitePaint);
        canvas.rotate(degrees);

    }

    private float degrees = 0;          //旋转角度

    public void setRotate(float degrees) {
        this.degrees = degrees;
        invalidate();                   //重绘界面
    }


}
