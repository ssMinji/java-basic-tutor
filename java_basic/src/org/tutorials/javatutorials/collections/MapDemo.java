package org.tutorials.javatutorials.collections;

import java.util.*;

// Map 
public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		// key의 데이터타입과 value의 데이터타입을 각각 지정해주게 됨 
		// 첫번째 매개변수는 key, 두번째 매개변수 value
		a.put("one", 1); // put은 Map 인터페이스에 존재하는 메소드 
		a.put("two", 2); 
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one")); // 1
		System.out.println(a.get("two")); // 2
		System.out.println(a.get("three")); // 3

		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}

	// Map의 원소 가져오는 방법 두가지
	// 1) 
	static void iteratorUsingForEach(HashMap map){
		// Map.Entry인터페이스가 Set 안에 들어가게 됨 
		// Map.Entry에는 다음의 API가 존재(getKey, getValue)
		// 제네릭 인자 String-> getKey, Integer->getValue
		// 우리의 맵은 키가 스트링, 벨류가 정수이기 때문.
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// Map자체에는 이터레이터기능이 없기 때문에 맵에 담겨있는 데이터를 가지고 있는 set을 만든것
		// set에 들어가있는 데이터타입은 Map.Entry인것 
	}
	// 2) 
	static void iteratorUsingIterator(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()){
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	// Map은 수학의 함수를 프로그래밍 한 것 

}
