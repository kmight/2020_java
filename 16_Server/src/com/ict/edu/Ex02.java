package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02 implements Runnable{
	static ServerSocket ss;
	public static void main(String[] args) {
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중 >> ");
			
			Ex02 e2 = new Ex02();
			Thread thread = new Thread(e2);
			thread.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void run() {
		while(true) {
			try {
				
				Socket s = ss.accept();
				// 클라이언트에 대한 정보를 출력
				String ip = s.getInetAddress().getHostAddress();
				String name = s.getInetAddress().getHostName();
				
				System.out.println("ip : " + ip);
				System.out.println("name : " + name);
				System.out.println("Server : 수고하셨습니다.");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
