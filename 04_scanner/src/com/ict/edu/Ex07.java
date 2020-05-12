package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		esc : while(true) {
			System.out.println("입금액 : ");
			int pay = sc.nextInt();
			
			System.out.println("메뉴 : 1. 커피음료 (3,500원)");
			System.out.println("       2. 이온음료 (2,500원)");
			System.out.println("       3. 물 (1,500원)");
			System.out.println("       4. 과일쥬스 (4,000원)");
			System.out.println();
			
			String menuName = "";
			int danga = 0;
			
			while(true) {
				System.out.println("메뉴를 선택하세요(단, 부가세 포함) : ");
				int menu = sc.nextInt();
				
				if(menu > 0 && menu < 5) {
					if(menu == 1) {
						menuName = "커피음료";
						danga = 3500;
					} else if(menu == 2) {
						menuName = "이온음료";
						danga = 2500;
					} else if(menu == 3) {
						menuName = "물";
						danga = 1500;
					} else if(menu == 4) {
						menuName = "과일쥬스";
						danga = 4000;
					} // if
					break;
				} else {
					System.out.println("1~4까지의 숫자로 입력해주세요");
					continue;
				} // if
			} // while
			
			int jandon = 0;
			
			jandon = pay - (int)(danga - (danga * 0.1));
			
			System.out.println("선택한 음료 : " + menuName);
			System.out.println("입금액 : " + pay);
			System.out.println("잔돈 : " + jandon);
			
			while(true) {
				System.out.println();
				System.out.println("계속하시겠습니까?(1.계속 2.그만)");
				int more = sc.nextInt();
				
				if(more == 1) {
					continue esc;
				} else if(more == 2) {
					System.out.println("감사합니다. BYE~");
					break esc;
				} else {
					System.out.println("1 또는 2 숫자로 입력해주세요");
					continue;
				} // if
			} // while
					
		} // while
	} // main
} // class








