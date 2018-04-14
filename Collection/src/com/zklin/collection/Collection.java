package com.zklin.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {
		Collection collection = new Collection();
		collection.testList();
		collection.testSet();
		collection.testMap();
	}

	public void testList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

	public void testMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan", 22);
		map.put("lisi", 33);
		map.put("wangwu", 44);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
