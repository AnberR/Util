package com.itheima73.googleplay.util;

import java.util.Random;

import android.graphics.Color;

public class ColorUtil {
	/**
	 * 随机生成漂亮的颜色
	 * @return
	 */
	public static int randomColor(){
		Random random = new Random();
		//如果rgb过大会偏白，过小则偏黑，那么要取中间的值
		int red = random.nextInt(200);//0-200
		int green = random.nextInt(200);//0-200
		int blue = random.nextInt(200);//0-200
		return Color.rgb(red, green, blue);//使用rgb混合生成新的颜色
	}
}
