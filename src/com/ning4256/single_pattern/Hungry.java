package com.ning4256.single_pattern;

public class Hungry {
	//3.指向本类对象的属性
	private static Hungry instance = new Hungry();
	//1.私有化构造器
	private Hungry() {
		
	}
	//2.提供一个接口调用这个构造方法
	public static Hungry getInstance() {
		return instance;
	}
}
