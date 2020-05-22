package com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value로 맵핑하는 구조로 이루어짐
		//					Key는 중복될 수 없다.
		//					Key를 호출하면 Value가 나온다.
		//					Key를 별도로 관리 => keySet()
		//					add()로 추가 못함
		//					put(key, value) 추가한다.
		
		// Map생성 (key 숫자로 만든다.)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// 추가 : add X, put(k,v) => add는 사용못함, 대신 put을 사용
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "중국");
		map1.put(3, "태국");
		map1.put(4, "영국");
		map1.put(15, "한국"); // key값은 중복안됨(Unique), value값은 중복가능/.
		map1.put(6, "한국");
		map1.put(3, "영국"); // key중복 : 덮어쓴다
		
		System.out.println(map1);
		
		// 하나씩 출력 (get(key) => value가 나온다.
		System.out.println(map1.get(4));
		System.out.println(map1.get("한국"));
		System.out.println("===========================");
		
		// 일부러 key를 순서대로 만들었기 때문에 for문을 사용할 수 있다
		
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println("==========================");
		
		// 1씩 증가하지
		for (Integer k : map1.keySet()) {
			System.out.println(k);
			System.out.println(map1.get(k));
			System.out.println("-------------------------");
		}
		
		// Map 생성 (key를 문자열(String)로 만든다 => 일반적인 방법)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름","고길동");
		map2.put("나이","34");
		map2.put("주소","서울시 도봉구 방학동");
		map2.put("성별","남");
		map2.put("취미","잠자기");
		System.out.println(map2);
		
		for (String k : map2.keySet()) {
			System.out.println(k + " : " +  map2.get(k));
		}
		System.out.println("===================");
		Iterator<String> it = map2.keySet().iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(map2.get(res));
		}
		
	}
}


















