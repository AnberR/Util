package com.itheima73.googleplay.util;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

public class DrawableUtil {
	/**
	 * 生成圆角图片，对应的就是shape标签创建的图片
	 * @param rgb
	 * @param radius
	 * @return
	 */
	public static GradientDrawable generateDrawable(int rgb,float radius){
		GradientDrawable drawable = new GradientDrawable();
		drawable.setShape(GradientDrawable.RECTANGLE);//设置形状，默认就是矩形
		drawable.setCornerRadius(radius);//设置圆角的半径
		drawable.setColor(rgb);//设置颜色
		return drawable;
	}
	/**
	 * 生成状态选择器
	 * @param pressed
	 * @param normal
	 * @return
	 */
	public static StateListDrawable generateSelector(Drawable pressed,Drawable normal){
		StateListDrawable drawable = new StateListDrawable();
		drawable.addState(new int[]{android.R.attr.state_pressed}, pressed);//设置按下的图片
		drawable.addState(new int[]{}, normal);//设置默认的图片
		return drawable;
	}
}
