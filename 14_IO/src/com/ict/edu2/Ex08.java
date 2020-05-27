package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex08 {
	public static void main(String[] args) {
		String pathname 
		= "C:"+File.separator+"study"+File.separator+"util"+File.separator+"io03.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		
		// 속도향상을 위해 Buffer 사용, 혼자서는 사용 못함
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			// 하나씩 읽어오기
			// int m = bis.read(); // 하나씩 읽어서 m 에 그 숫자를 넘긴다.(int)
			// System.out.println(m + " : " + (char)m);
			
			// 파일의 모든 내용 읽기
			// 1. while
			/*
			int m = 0;
			while ((m = bis.read()) != -1) {
				System.out.print((char)(m));
			}
			*/
			// 2. 배열
			/*
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			for (byte k : b) {
				System.out.print((char)(k));
			}
			*/
			// 3. String
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
			//bis.flush(); // 읽을 때는 사용하지 않는다.
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
