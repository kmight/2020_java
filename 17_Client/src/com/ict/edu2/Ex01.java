package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex01 implements Runnable{
	Socket s;
	
	OutputStream os;
	BufferedOutputStream bos ;
	InputStream is;
	BufferedInputStream bis;
	Scanner sc = new Scanner(System.in);
	public Ex01() {
		new Thread(this).start();
	}
	@Override
	public void run() {
		try {
			while(true) {
				System.out.print("입력 : ");
				String msg = sc.next();
				
				s = new Socket("203.236.220.79", 7777);
			
				// 보내자
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				bos.write(msg.getBytes());
				bos.flush();
				
				// 받자
				is = s.getInputStream();
				bis = new BufferedInputStream(is);
				/*
				int b = 0 ;
				StringBuffer sb = new StringBuffer();
				while((b = bis.read())!= -1) {
					sb.append((char)(b));
				}
				String str = sb.toString();
				*/
				/*
				byte[] b = new byte[1024];
				bis.read(b);
				String str = new String(b);
				System.out.println("서버에온 문자 : " + str);
				
				// 배열로 쭉 이어지므로 contains()사용
				// if (str.equalsIgnoreCase("exit")) break;
				if (str.contains("bye")) { 
					System.out.println("안녕~");
					break;
				} else if (str.contains("exit")) {
					System.out.println("안녕~");
					break;
				}
				*/
				byte[] b = new byte[1024];
				bis.read(b);
				
				// String msg = sb.toString();
				String str = new String(b);
				str = str.trim();
				System.out.println("서버에온 문자 : " + str);
				
				if (str.equalsIgnoreCase("bye")) { 
					System.out.println("안녕~");
					break;
				} else if (str.equalsIgnoreCase("exit")) {
					System.out.println("안녕~");
					break;
				}				
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				s.close();
				bos.close();
				os.close();
				bis.close();
				is.close();
			} catch (Exception e2) {
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
