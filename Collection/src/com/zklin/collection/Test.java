package com.zklin.collection;

import java.util.concurrent.SynchronousQueue;

public class Test {
	// ���ɱ��String
	public static String appendStr(String s) {
		s += "bbb";
		return s;
	}

	// �ɱ��StringBuilder
	public static StringBuilder appendSb(StringBuilder sb) {
		return sb.append("bbb");
	}

	public static void main(String[] args) {
		// String������
		String s = new String("aaa");
		String ns = Test.appendStr(s);
		System.out.println("String aa >>>" + s.toString());
		// stringBuilder������
		StringBuilder sb = new StringBuilder("aaa");
		StringBuilder nsb = Test.appendSb(sb);
		System.out.println("StringBuilder aaa >>>" + sb.toString());
	}
}
