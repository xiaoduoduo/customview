package com.liduo.kevin.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liduo on 2017/10/31.
 */

public class CustomView extends View {
    private Paint mPaint;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
        recording();

    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
//        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5f);
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        canvas.drawColor(Color.BLUE);
        drawGraph(canvas);


    }

    private void drawGraph(Canvas canvas) {

        /**points**********************************************/
//        canvas.drawPoint(200, 200, mPaint);
//        canvas.drawPoints(new float[]{
//                500,500,
//                500,600,
//                500,700
//        },mPaint);

        /**lines**********************************************/
//        canvas.drawLine(300,300,500,600,mPaint);
//        canvas.drawLines(new float[]{
//                100,200,200,200,
//                100,400,200,400
//        },mPaint);

        /**rect 1**********************************************/
//        canvas.drawRect(0, 0, 200, 100, mPaint);
//        // rect 2 Rect是int(整形)的
//        canvas.drawRect(new Rect(0, 0, 200, 100), mPaint);
//        // rect 3 RectF是float(单精度浮点型)的
//        canvas.drawRect(new RectF(0, 0, 200, 100),mPaint);

        /**round rect**********************************************/
//        canvas.drawRoundRect(100,100,600,300,30,30,mPaint); //api 21
//        canvas.drawRoundRect(new RectF(100, 100, 600, 300), 30, 30, mPaint);

        /**oval**********************************************/
//        canvas.drawOval(100,100,600,300,mPaint);  //api 21
//        canvas.drawOval(new RectF(100, 100, 600, 300), mPaint);

        /**circle**********************************************/
//        canvas.drawCircle(300, 300, 200, mPaint);

        /**arc**********************************************/
        // 绘制背景矩形
//        RectF rectF = new RectF(100, 100, 300, 300);
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(rectF, mPaint);
//        // 绘制圆弧
//        mPaint.setColor(Color.BLUE);
//        canvas.drawArc(rectF, 0, 90, false, mPaint);
//
//        RectF rectF2 = new RectF(100, 700, 600, 1200);
//        // 绘制背景矩形
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(rectF2, mPaint);
//        // 绘制圆弧
//        mPaint.setColor(Color.BLUE);
//        canvas.drawArc(rectF2, 0, 90, true, mPaint);

        /**paint**********************************************/
//        Paint paint = new Paint();
//        paint.setColor(Color.BLUE);
//        paint.setStrokeWidth(40);
//        // 描边
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawCircle(200,200,100,paint);
//
//        // 填充
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawCircle(200,500,100,paint);
//
//        // 描边+填充
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        canvas.drawCircle(200,700,100,paint);
//
//        // 描边 直线
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5);
//        paint.setColor(Color.BLACK);
//        canvas.drawLine(100,0,100,900,paint);

        /**canvas******位移、缩放、旋转、错****************************************/
//        mPaint.setColor(Color.BLACK);
//        canvas.translate(200, 200);
//        canvas.drawCircle(0, 0, 100, mPaint);
//
//        mPaint.setColor(Color.BLUE);
//        canvas.translate(200, 200);
//        canvas.drawCircle(0, 0, 100, mPaint);

//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rect = new RectF(0, -400, 400, 0);
//
//        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
//        canvas.drawRect(rect, mPaint);
//        canvas.scale(0.5f,0.5f);                // 画布缩放
//        canvas.scale(0.5f, 0.5f, 200, 0);          // 画布缩放  <-- 缩放中心向右偏移了200个单位
//        canvas.scale(-0.5f,-0.5f);
//        canvas.scale(-0.5f, -0.5f, 200, 0);          // 画布缩放  <-- 缩放中心向右偏移了200个单位

//        mPaint.setColor(Color.BLUE);            // 绘制蓝色矩形
//        canvas.drawRect(rect, mPaint);

        //缩放是可以叠加的
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rectF = new RectF(-400, -400, 400, 400);
//        for (int i = 0; i <= 40; i++) {
//            canvas.scale(0.9f, 0.9f);
//            canvas.drawRect(rectF, mPaint);
//        }

//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rect = new RectF(0, -400, 400, 0);   // 矩形区域
//        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
//        canvas.drawRect(rect, mPaint);
//        canvas.rotate(180);
//        canvas.rotate(180, 200, 0);      // 向右平移200距离
//        mPaint.setColor(Color.BLUE);
//        canvas.drawRect(rect, mPaint);

        //两次旋转是可以叠加的
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        canvas.drawCircle(0, 0, 400, mPaint);
//        canvas.drawCircle(0, 0, 380, mPaint);
//        for (int i = 0; i < 360; i += 10) {
//            canvas.drawLine(0, -400, 0, -380, mPaint);
//            canvas.rotate(10);
//        }

//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rect = new RectF(0,0,200,200);   // 矩形区域
//        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
//        canvas.drawRect(rect,mPaint);
//        canvas.skew(1,0);                       // 水平错切 <- 45度
//        mPaint.setColor(Color.BLUE);            // 绘制蓝色矩形
//        canvas.drawRect(rect,mPaint);

        /**canvas******位快照(save)和回滚(restore)****************************************/
//        save();      //保存状态 保存画布状态,后续绘制的都是在新画布坐标
//   ...          //具体操作
//        restore();   //回滚到之前的状态 恢复画布状态
        /**canvas******图片和文字****************************************/
//        mPicture.draw(canvas);
//        canvas.drawPicture(mPicture,new RectF(0,0,mPicture.getWidth(),200));
        // 包装成为Drawable
//        PictureDrawable drawable = new PictureDrawable(mPicture);
//        // 设置绘制区域 -- 注意此处所绘制的实际内容不会缩放
//        drawable.setBounds(0, 0, 250, mPicture.getHeight());
//        // 绘制
//        drawable.draw(canvas);
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.baby);
//        canvas.drawBitmap(bitmap, new Matrix(), new Paint());
//        canvas.drawBitmap(bitmap, 200, 200, new Paint());
//        Rect src = new Rect(0, 0, getWidth() / 2, getHeight() / 2);
//        Rect dst = new Rect(0, 0, getWidth(), getHeight());
//        canvas.drawBitmap(bitmap, null, dst, null);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(Color.BLACK);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(2);
        textPaint.setTextSize(80);
        String str = "ABCDEFGHIJKLMN";
//        canvas.drawText(str, 200, 200, textPaint);

        String str1 = "KEVIN";

        canvas.drawPosText(str1,new float[]{
                100,100,    // 第一个字符位置
                200,200,    // 第二个字符位置
                300,300,    // ...
                400,400,
                500,500
        },textPaint);



    }


    //创建 pic
    private Picture mPicture = new Picture();

    //录制内容
    private void recording() {
        Canvas canvas = mPicture.beginRecording(500, 500);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        // 在Canvas中具体操作
        // 位移
        canvas.translate(250, 250);
        // 绘制一个圆
        canvas.drawCircle(0, 0, 100, paint);

        mPicture.endRecording();

    }
}
