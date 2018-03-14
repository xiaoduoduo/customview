package com.liduo.kevin.customview.circle;

/**
 * Created by liduo on 2017/10/31.
 */

public class PieData {

    //名称
    private String name;
    // 百分比
    private float value;
    // 数值
    private float percentage;

    //****************************************

    // 颜色
    private int color = 0;
    // 角度
    private float angle = 0;

    public PieData(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
