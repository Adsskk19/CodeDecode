package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
	hashMapOperation();
//	treehMapOperation();
//LinkedHashOperation();		

		
	}
	private static LinkedHashMap<String, Integer> LinkedHashOperation() {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
		linkedHashMap.put("kiran", 7207);
		linkedHashMap.put("kumar", 9954);
		linkedHashMap.put("Mani", 9870);
		linkedHashMap.put("vinay", 8970);
//		treeMap.put(null, 1);
		System.out.println("Treemap: "+linkedHashMap);
		System.out.println(linkedHashMap.get("kiran"));
		System.out.println(linkedHashMap.isEmpty());
		System.out.println(linkedHashMap.keySet()); //keys
		System.out.println(linkedHashMap.values()); //values
		return linkedHashMap;
	}
	private static TreeMap<String, Integer> treehMapOperation() {
		TreeMap<String, Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("kiran", 7207);
		treeMap.put("kumar", 9954);
		treeMap.put("Mani", 9870);
		treeMap.put("vinay", 8970);
//		treeMap.put(null, 1);
		
		System.out.println("Treemap: "+treeMap);
		System.out.println(treeMap.get("kiran"));
		System.out.println(treeMap.isEmpty());
		System.out.println(treeMap.keySet()); //keys
		System.out.println(treeMap.values()); //values
		return treeMap;
	}

	private static HashMap<String, Integer> hashMapOperation() {
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("kiran", 7207);
		hashMap.put("kumar", 9954);
		hashMap.put("Mani", 9870);
		hashMap.put("vinay", 8970);
		hashMap.put(null, 1);
//		System.out.println(hashMap);
//		System.out.println(hashMap.get("kiran"));
//		System.out.println(	hashMap.isEmpty());
//		System.out.println(hashMap.keySet()); //keys
//		System.out.println(hashMap.values()); //values
		
//		Collection<Integer> values = hashMap.values();
//		Set<String> keySet = hashMap.keySet();
		
		for(Map.Entry<String, Integer> e:hashMap.entrySet()) {
			System.out.println("Keys: "+e.getKey()+":"+"value: "+e.getValue());
			System.out.println();

		}
		
		System.out.println("------------------------------------------------------");
		
		for(String k:hashMap.keySet()) {
			System.out.println(k+" :" +hashMap.get(k));
		}
		
		return hashMap;
	}
}
