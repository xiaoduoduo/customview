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

import java.util.ArrayList;

/**
 * Created by liduo on 2017/10/31.
 */

public class PieView extends View {

    private ArrayList<PieData> datas;
    private int colors[] = {Color.DKGRAY, Color.RED, Color.YELLOW, Color.GREEN, Color.CYAN, Color.GRAY};
    private Paint paint;
    private int height, width;

    public PieView(Context context) {
        super(context);
        init();
    }

    public PieView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
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
        Log.i("PieView", "height:" + height + " width:" + width);
        Log.i("PieView", "height:" + getHeight() + " width:" + getWidth());
    }

    private float startAngle = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 移动画布
        canvas.translate(width / 2, height / 2);
        float r = (float) (Math.min(width, height) / 2 * 0.8);
        // 绘制正方形
        RectF rectF = new RectF(-r, -r, r, r);

        float currentAngle = startAngle;
        // 初始化数据
        for (int i = 0; i < datas.size(); i++) {
            PieData pie = datas.get(i);
            paint.setColor(pie.getColor());
            canvas.drawArc(rectF, currentAngle, pie.getAngle(), true, paint);
            currentAngle += pie.getAngle();
        }

    }


    /**
     * 设置初始的角度
     *
     * @param startAngle
     */
    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
        invalidate();
    }

    public void setData(ArrayList<PieData> datas) {
        this.datas = datas;
        initData(this.datas);
        // 进行重绘
        invalidate();

    }


    /**
     * 初始化数据
     *
     * @param datas
     */
    private void initData(ArrayList<PieData> datas) {

        if (datas == null || datas.isEmpty()) {
            return;
        }
        float sumValue = 0;

        /**
         *
         * 获取总数 设置颜色
         */
        for (int i = 0; i < datas.size(); i++) {
            PieData pie = datas.get(i);
            sumValue += pie.getValue();
            int j = i % colors.length;
            pie.setColor(colors[j]);
        }

        /**
         * 设置角度
         */
        for (int i = 0; i < datas.size(); i++) {
            PieData pie = datas.get(i);
            float angle = pie.getValue() / sumValue * 360;
            pie.setAngle(angle);
            pie.setPercentage(pie.getValue() / sumValue);
        }
    }



}
