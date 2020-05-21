package com.ict.edu;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// 컬렉션을 배열로 변경 => toArray() 사용
		// 배열을 컬렉션으로 변경
		String[] str = {"java", "JAVA", "Java", "자바"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		
		// 배열의 길이 만큼 반복함
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println("===================");
		
		// set1의 모든 요소를 set2에 넣어주세요
		set2.addAll(set1);
		
		set1.add("HTML");
		set1.add("CSS");
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("===================");
		
		// set2에서 "자바"삭제
		set2.remove("자바");
		
		// set2에 다른 정보 넣기
		set2.add("jsp");
		set2.add("android");
		set2.add("Python");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("===================");
		
		// 중복검사
		// set2의 정보를 set1에 추가한다
		for (String k : set2) {
			if(!set1.add(k)) { // 중복되었을 때 할 일
				System.out.println("중복 : " + k);
				set3.add(k);
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println("===================");
		
		
		
	}
}
