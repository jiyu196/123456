package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex250423 {
	public static void main(String[] args) {
		//1. 학생 예제 내의 정렬을 List의 sort로 구현, Comparator 사용
		
		//2. Map을 사용한 문자의 빈도 계산
		String str = "aaaaabbbbcccddddd";
		Integer ing = 0;
		//{a:5, b:4, c:3, d:5}
		Map<String, Integer> map = new  HashMap<>();
		map.put("a",ing);
		map.put("b",ing);
		map.put("c",ing);
		map.put("d",ing);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(int i = 0; i < ing; i++) {
			map.put(str, ing);
		}
		System.out.println(map.get(keys));
		
//		List<Integer> str1 = new ArrayList<Integer>(map.values());
//		Set<Integer> str2 = new HashSet<Integer>(map.values());
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		Set<Entry<String, Integer>>s = map.entrySet();
//		for(Entry<String, Integer> e: s) {
//			
//		}
		
		
		
	}
}
