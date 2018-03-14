package com.liduo.kevin.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liduo on 2017/10/31.
 */

public class PathView extends View {

    private Paint mPaint;

    public PathView(Context context) {
        super(context);
        init();
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private void init() {
        mPaint = new Paint();             // 创建画笔
        mPaint.setColor(Color.GREEN);           // 画笔颜色 - 黑色
        mPaint.setStyle(Paint.Style.STROKE);    // 填充模式 - 描边
        mPaint.setStrokeWidth(10);              // 边框宽度 - 10
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        Path path = new Path();
        /**  第1组： moveTo、 setLastPoint、 lineTo 和 close */
//        path.lineTo(200, 200); //起点是原点
//        path.moveTo(200, 100);//只改变下次操作的起点
//        path.setLastPoint(200, 100);//更改上次最后一个点的坐标

//        path.lineTo(200, 0);
        //最后一个点和最开始的点 close的作用是封闭路径，
        // 与连接当前最后一个点和第一个点并不等价。
        // 如果连接了最后一个点和第一个点仍然无法形成封闭图形，则close什么 也不做
//        path.close();
//        canvas.drawPath(path, mPaint);
        /** 第2组: addXxx与arcTo */
        /** 第一类(基本形状)*/
//        path.addRect(-200, -200, 200, 200, Path.Direction.CW);//顺时针记录个点
//        path.addRect(-200, -200, 200, 200, Path.Direction.CW);//逆时针记录个点
//        path.setLastPoint(-300,300);
//        canvas.drawPath(path, mPaint);

//        canvas.translate(getWidth() / 2, getHeight() / 2);  // 移动坐标系到屏幕中心
//        Path path = new Path();
//        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);
//        path.setLastPoint(-300, 300);                // <-- 重置最后一个点的位置
//        path.close();
//        canvas.drawPath(path, mPaint);
        /** 第二类 Path*/
//        canvas.translate(getWidth() / 2, getHeight() / 2);  // 移动坐标系到屏幕中心
//        canvas.scale(1, -1); //沿Y轴翻转
//        Path path = new Path();
//        Path src = new Path();
//
//        RectF rect = new RectF(-400, -400, 400, 400);
//        src.addRect(rect, Path.Direction.CW);
//        src.addCircle(0, 200, 200, Path.Direction.CW);
//        path.addPath(src);
//        canvas.drawPath(path, mPaint);
        /** 第三类 addArc和 arcTo */
        // addArc 直接添加一个圆弧到path中
        // arcTo  添加一个圆弧到path，如果圆弧的起点和上次最后一个坐标点不相同，就连接两个点
        canvas.translate(getWidth() / 2, getHeight() / 2);  // 移动坐标系到屏幕中心
        canvas.scale(1, -1); //沿Y轴翻转
        Path path = new Path();
        path.lineTo(100, 100);
        RectF oval = new RectF(0, 0, 300, 300);
//        path.addArc(oval, 0, 270);
        // path.arcTo(oval,0,270,true);             // <-- 和上面一句作用等价
        path.arcTo(oval, 0, 270);
        canvas.drawPath(path, mPaint);
       /** 第三类 第3组：isEmpty、 isRect、isConvex、 set 和 offset
        * isEmpty:判断path是否包含内容。
        * isRect：判断是否是一个矩形。
        * isConvex：将新的path赋值到现有path。
        * set：新的path赋值到现有path。
        * offset：这个的作用也很简单，就是对path进行一段平移，
        *         它和Canvas中的translate作用很像，
        *         但Canvas作用于整个画布，而path的offset只作用于当前path。      */

        /**  Path之贝塞尔曲线
         * 数据点：确定曲线的起始位置
         * 控制点：确定曲线的弯曲程度
         * 一阶曲线：没有控制点，只有AB两个数据点 对应函数：lineTo
         * 二阶曲线：控制点C，AB两个数据点 对应函数：quadTo
         * 三阶曲线：由两个数据点(A 和 D)，两个控制点(B 和 C)来描述曲线状态 对应函数：cubicTo
         * */


    }

}
