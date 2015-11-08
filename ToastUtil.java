package com.itheima73.googleplay.util;

import com.itheima73.googleplay.global.GooglePlayApplication;

import android.widget.Toast;

public class ToastUtil {
	private static Toast toast;//单例的吐司
	public static void showToast(String text){
		if(toast==null){
			toast = Toast.makeText(GooglePlayApplication.getContext(), text,0);
		}
		toast.setText(text);//将文本设置给吐司
		toast.show();
	}
}
