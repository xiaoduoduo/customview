package com.liduo.kevin.customview.Path;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by liduo on 2017/11/1.
 * <p>
 * 二阶贝塞尔曲线
 * <p>
 * 什么情况下使用贝塞尔曲线
 * <p>
 * 1 事先不知道曲线状态，需要实时计算时	天气预报气温变化的平滑折线图
 * 2 显示状态会根据用户操作改变时	QQ小红点，仿真翻书效果
 * 3 一些比较复杂的运动状态(配合PathMeasure使用)	复杂运动状态的动画效果
 */

public class Bezier2 extends View {
    private Paint mPaint;
    private int centerX, centerY;
    private PointF start, end, control1, control2;

    public Bezier2(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(8);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setTextSize(60);
        start = new PointF(0, 0);
        end = new PointF(0, 0);
        control1 = new PointF(0, 0);
        control2 = new PointF(0, 0);
    }

    public Bezier2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        centerX = w / 2;
        centerY = h / 2;
        // 初始化数据点和控制点的位置
        start.x = centerX - 200;
        start.y = centerY;
        end.x = centerX + 200;
        end.y = centerY;
        control1.x = centerX;
        control1.y = centerY - 100;
        control2.x = centerX;
        control2.y = centerY - 100;

    }

    @Override
    protected void onDraw(Canvas canvas) {

        // 绘制数据点和控制点
        mPaint.setColor(Color.GRAY);
        mPaint.setStrokeWidth(20);
        canvas.drawPoint(start.x, start.y, mPaint);
        canvas.drawPoint(end.x, end.y, mPaint);
        canvas.drawPoint(control1.x, control1.y, mPaint);
        canvas.drawPoint(control2.x, control2.y, mPaint);
        // 绘制数据点和控制点
        mPaint.setStrokeWidth(4);
        canvas.drawLine(start.x, start.y, control1.x, control1.y, mPaint);
        canvas.drawLine(control1.x, control1.y, control2.x, control2.y, mPaint);
        canvas.drawLine(end.x, end.y, control2.x, control2.y, mPaint);
        // 绘制贝塞尔曲线
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(8);
        Path bezier = new Path();
        bezier.moveTo(start.x, start.y);
        bezier.cubicTo(control1.x, control1.y, control2.x, control2.y, end.x, end.y);
        canvas.drawPath(bezier, mPaint);


    }

    /**
     * 这块逻辑还可以说暂时省略
     */
    private boolean mode = true;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (mode) {
            control1.x = event.getX();
            control1.y = event.getY();
        } else {
            control2.x = event.getX();
            control2.y = event.getY();
        }


        invalidate();
        return true;

    }
}
