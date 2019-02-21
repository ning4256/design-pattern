package com.ning4256.adapter_pattern;

public class CarAdapter extends CarLighter implements Port{

	@Override
	public void charging() {
		System.out.println("通过适配器完成充电功能");
	}

}
