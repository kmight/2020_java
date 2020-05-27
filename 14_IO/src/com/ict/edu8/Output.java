package com.ict.edu8;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

// 쓰기, 파일만들기
public class Output {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"io11.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			/* 
			VO vo1 = new VO("aaaa", 100, 100, 100);
			VO vo2 = new VO("bbbb", 80, 80, 80);
			VO vo3 = new VO("cccc", 90, 90, 90);
			VO vo4 = new VO("dddd", 60, 60, 60);
			VO vo5 = new VO("eeee", 70, 70, 70);
			
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			*/
			
			Scanner sc = new Scanner(System.in);
			
			ArrayList<VO> list = new ArrayList<VO>();
			
			for (int i = 0; i < 5; i++) {
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("국어점수 : ");
				int kor = sc.nextInt();
				System.out.println("영어점수 : ");
				int eng = sc.nextInt();
				System.out.println("수학점수 : ");
				int math = sc.nextInt();
				
				VO vo = new VO(name, kor, eng, math);
				
				list.add(vo);
			}
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {

		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
