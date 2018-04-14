package com.zklin.collection;

import java.util.concurrent.SynchronousQueue;

public class Test {
	// 不可变的String
	public static String appendStr(String s) {
		s += "bbb";
		return s;
	}

	// 可变的StringBuilder
	public static StringBuilder appendSb(StringBuilder sb) {
		return sb.append("bbb");
	}

	public static void main(String[] args) {
		// String做参数
		String s = new String("aaa");
		String ns = Test.appendStr(s);
		System.out.println("String aa >>>" + s.toString());
		// stringBuilder做参数
		StringBuilder sb = new StringBuilder("aaa");
		StringBuilder nsb = Test.appendSb(sb);
		System.out.println("StringBuilder aaa >>>" + sb.toString());
	}
}
