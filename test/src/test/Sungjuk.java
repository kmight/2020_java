package test;

import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] arr = new Person[5];
		
		// 입력 및 계산, 데이터 저장
		for (int i = 0; i < 5; i++) {
			Person person = new Person();			
			System.out.println("이름 : ");
			person.setName(sc.next());
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			
			person.s_sum(kor, eng, math);
			
			arr[i] = person;
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				} // if
			} // for
		} // for
		
		// 정렬
		Person temp = new Person();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} // if
			} // for
		} // for
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (Person k : arr) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
		}
		
	}
}


















