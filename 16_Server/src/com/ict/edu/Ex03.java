package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03 implements Runnable{
	ServerSocket ss = null;
	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기 중 .... > ");
			
			new Thread(this).start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				System.out.println("1 " + Thread.currentThread().getName() + " :-> ");
				Socket s = ss.accept();
				System.out.println("ip : " + s.getInetAddress().getHostAddress());
				System.out.println("2 " + Thread.currentThread().getName() + " :->> ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Ex03();
		
		System.out.println("*1 " + Thread.currentThread().getName());
		System.out.println("*2 " + Thread.currentThread().getName());
		System.out.println("*3 " + Thread.currentThread().getName());
	}
	
}
