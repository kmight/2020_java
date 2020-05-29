package com.ict.edu;

import java.net.Socket;

public class Ex03 implements Runnable {
	Socket s = null;
	public Ex03() {
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				s = new Socket("203.236.220.79", 7777);
				System.out.println("수고하셨습니다.");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex03();
	}
	
}
