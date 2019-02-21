package com.ning4256.adapter_pattern;

public class Test {
	public static void main(String[] args) {
		Port port = new CarAdapter();
		port.lighter();
		port.charging();
	}
}
