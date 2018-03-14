package com.liduo.kevin.customview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liduo on 2017/11/1.
 *
 *思路：
 *  1. 确定雷达的中心点坐标
 *  2. 绘制多边形以及连接线
 *  3. 根据维度值绘制覆盖区域
 *  4. 绘制分数
 *  5. 绘制每个维度的标题文字和图标
 */

public class RadarView extends View {
    public RadarView(Context context) {
        super(context);
    }

    public RadarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
