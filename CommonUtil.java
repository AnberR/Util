package com.itheima73.googleplay.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.itheima73.googleplay.global.GooglePlayApplication;

public class CommonUtil {
	/**
	 * 在主线程执行任务
	 */
	public static void runOnUIThread(Runnable runnable){
		GooglePlayApplication.getMainHandler().post(runnable);
	}
	/**
	 * 将子View从父VIew中移除
	 * @param child
	 */
	public static void removeSelfFromParent(View child){
		if(child!=null){
			ViewParent parent = child.getParent();
			if(parent!=null && parent instanceof ViewGroup){
				ViewGroup group = (ViewGroup) parent;
				group.removeView(child);//从父View中移除
			}
		}
	}
	
	/**
	 * 获取颜色资源
	 * @param id
	 * @return
	 */
	public static int getColor(int id){
		return GooglePlayApplication.getContext().getResources().getColor(id);
	}
	
	/**
	 * 获取dp资源
	 * @param id
	 * @return
	 */
	public static float getDimens(int id){
		return GooglePlayApplication.getContext().getResources().getDimension(id);
	}
	
	
	
	
	/**
	 * 获取字符串资源
	 * @param id
	 * @return
	 */
	public static String getString(int id){
		return GooglePlayApplication.getContext().getResources().getString(id);
	}
	
	/**
	 * 获取字符串数组资源
	 * @param id
	 * @return
	 */
	public static String[] getStringArray(int id){
		return GooglePlayApplication.getContext().getResources().getStringArray(id);
	}
	
	
	/**
	 * 获取图片资源
	 * @param id
	 * @return
	 */
	public static Drawable getDrawable(int id){
		return GooglePlayApplication.getContext().getResources().getDrawable(id);
	}
}
