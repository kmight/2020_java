package com.ict.edu4;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read() : int(아스키코드)=>형변환, read(byte[] b)
// FileReader	   : read() : int(유니코드)=>형변환, reade(char[] b)
public class Ex03 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			// 한 글자 읽기
			//int k = fr.read();
			//System.out.println(k + " : " + (char)(k));
			
			// 전체 읽기
			/*
			int k = 0;
			while((k = fr.read()) != -1) {
				System.out.print((char)(k)); // read() 로 불러오는 값이 int이므로 char로 형변환해야 한다.
			}
			*/
			
			// char[]
			/*
			char[] c = new char[(int) file.length()];
			fr.read(c);
			for (char k : c) {
				System.out.print(k);
			}
			*/
			
			// String
			char[] c = new char[(int) file.length()]; // 각 문자는 char이므로 char배열로 만든다
			fr.read(c); // char배열은 곧 문자열 이므로 char배열을 읽는다.
			String msg = new String(c); // char배열을 String클래스를 이용한다.
			System.out.println(msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
















