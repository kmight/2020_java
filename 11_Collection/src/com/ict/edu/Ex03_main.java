package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		// 값 변경, 넣어주는 방법 : 기본 생성자로 만들어서 setter()
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(24);
		p1.setWeight(105.4);
		
		// 값 변경, 넣어주는 방법 : 인자가 있는 생성자에 값을 넣어준다.
		Ex03 p2 = new Ex03("희동이", 3, 40.5);
		Ex03 p3 = new Ex03("마이콜", 17, 56.3);
		
		// 객체를 저장하는 방법 : 배열, 컬렉션
		// 1. 배열
		Ex03[] arr = new Ex03[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		// 이름 꺼내기 : 배열은 무조건 for문 사용
		for (Ex03 k : arr) {
			System.out.println(k.getName());
		}
		System.out.println("==================");
		
		// 2. 컬렉션
		HashSet<Ex03> set1 = new HashSet<Ex03>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(new Ex03("공실이", 21, 49.5));
		
		// 이름 꺼내기 : for, iterator
		for (Ex03 k : set1) {
			System.out.println(k.getName());
		}
		System.out.println("------------------");
		Iterator<Ex03> it = set1.iterator();
		while (it.hasNext()) {
			Ex03 res = (Ex03) it.next();
			System.out.println(res.getName());
		}
		System.out.println("==================");
		
		// 포함여부 : contains
		if (set1.contains(p1)) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		System.out.println("-----------------");
		
		// 크기구하기
		System.out.println("set1의 삭제 전 크기 : " + set1.size());
		
		// 이름 마이콜이 객체가 있는지 알아보자, 삭제하기 remove
		for (Ex03 k : set1) {
			
			if (k.getName().contains("마이콜")) {
				set1.remove(k);
				// set1 내용이 변경되었기 때문에 더이상 for문을 실행할 수 없음
				break;
			}
		}
		// 크기구하기
		System.out.println("set1의 삭제 후 크기 : " + set1.size());		
		System.out.println("-----------------");
		
		for (Ex03 k : set1) {
			System.out.println(k.getName());
		}
		
		// 모두 삭제 : clear(), // 비어있나? isEmpty()
		set1.clear();
		System.out.println("모두 삭제 후 크기 : " + set1.size());	
		
		boolean result = set1.isEmpty();
		if (result) {
			System.out.println("비어있습니다.");
		} else {
			System.out.println("남아 있습니다.");
		}
		
	}
}


















