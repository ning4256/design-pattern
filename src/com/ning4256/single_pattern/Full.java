package com.ning4256.single_pattern;
/*饱汉模式*/
public class Full {
	//3.静态私有指向本类的对象
	private static Full instance = null;
	//1.构造器私有化
	private Full() {
		
	}
	//2.工有的静态调用该类的方法
	public static Full getInstance() {
		if(instance == null) 
			instance = new Full();
		return instance;
	}
}
