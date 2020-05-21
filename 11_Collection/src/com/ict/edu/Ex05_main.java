package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Ex05> person = new HashSet<Ex05>();		
		//Ex05[] arr = new Ex05[3];
		//for (int i = 0; i < 5; i++) {
		while(true)	{
			Ex05 p = new Ex05();
			
			System.out.println("이름 : ");
			p.setName(sc.next());
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			
			p.s_sum(kor, eng, math);
			p.s_avg();
			p.s_hak();
			
			// arr[i] = p;
            person.add(p);
            
            System.out.println("계속할까요?(y/n)");
            String str = sc.next();
            if(str.equalsIgnoreCase("n")) break;
		//} // for
		} // while
		
		// 순위
		for (Ex05 k : person) {
			for (Ex05 j : person) {
				if(k.getSum() < j.getSum()) {
					k.setRank(k.getRank() + 1);
				}
			}
		}
		
		// 정렬이 안된다. HashSet은 마구잡이 저장됨.
		
		// 출력
		for (Ex05 k : person) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getSum()+"\t");
			System.out.print(k.getAvg()+"\t");
			System.out.print(k.getHak()+"\t");
			System.out.println(k.getRank()+"\t");
		}
		
	} // main
} // class
