package com.ict.edu4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//BufferedWriter : 속도향상과 줄바꾸기 메소드가 존재한다.

public class Ex02 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 체인방식
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 숫자
			bw.write(97);
			// 숫자 대신 char
			bw.write('e');
			
			// 배열
			char[] c = {'j','a','v','a'};
			bw.write(c);
			
			// String : 줄바꾸기 메소드 => newLine(), Buffer를 이용할 때.
			bw.write("korean");
			bw.newLine();
			bw.write("대한민국");
			bw.newLine();
			bw.write("大韓民國");
			bw.newLine();
			bw.write("12345");
			bw.newLine();
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
