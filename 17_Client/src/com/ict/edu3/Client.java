package com.ict.edu3;

import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("203.236.220.79", 7788);
			
			ReceiveThread rec = new ReceiveThread(s);
			new Thread(rec).start();
			
			SendThread send = new SendThread(s);
			new Thread(send).start();
			
		} catch (Exception e) {
		}
	}
}
