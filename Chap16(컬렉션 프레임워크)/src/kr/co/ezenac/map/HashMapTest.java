package kr.co.ezenac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
	
		map.put("이순신", 95);
		map.put("정도전", 90);
		map.put("신사임당", 80);
		map.put("정도전", 95);
		map.put("이성계", 95);
		
		System.out.println("사이즈 : " + map.size()); //중복 허용하지 않음
		System.out.println("저장된 정도전 값 : " + map.get("정도전"));
		System.out.println();
		
		//map 컬렉션에 있는 key값만 Set 계열로 바꿈
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		System.out.println();	
		
		//map 컬렉션의 Map.Entry 객체를 대상으로 Set 계열로 바꿈
		Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key : " + key);
			System.out.println("value : " + value);
			
		}
		
		//전체 객체 삭제
		map.clear();
		System.out.println("사이즈 : "+ map.size());
		
		
	}
	
}
