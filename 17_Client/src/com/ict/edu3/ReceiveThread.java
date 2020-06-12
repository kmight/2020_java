package com.ict.edu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread implements Runnable{
	Socket s;
	
	InputStream in;
	InputStreamReader isr;
	BufferedReader br;
	public ReceiveThread(Socket s) {
		try {
			this.s = s ;
			// 입력준비
			in = s.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		try {
			while(true) {
				String msg = br.readLine();
				System.out.println(msg);
			}
			
		} catch (IOException e) {
		}
		
	}
}
