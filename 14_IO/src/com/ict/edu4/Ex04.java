package com.ict.edu4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// BufferedReader : 속도향상, readLine() => 한줄씩 읽는다. 더 이상 읽을 수 없을 때 null
public class Ex04 {
	public static void main(String[] args) {
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// 체인 - 서로 엮는다
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// 한 줄 읽기
			//String msg = br.readLine();
			//System.out.println(msg);
			
			// 모두 읽기
			String msg = null;
			String str = ""; // null을 넣을 경우 에러가 날 수 있다
			
			// String은 원래 누적해서 저장하지 않는 것이 좋다.
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				// 찍어보기
				//System.out.println(msg);
				// 저장하기
				// str = str + msg + "\n"; // 메모리에 계속 쌓인다. - 과부하 우려
				// str = str.concat(msg+"\n"); // 메모리에 계속 쌓인다. - 과부하 우려
				
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString()); // 안드로이드에서는 toString()을 안쓰면 출력되지 않는다.
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
