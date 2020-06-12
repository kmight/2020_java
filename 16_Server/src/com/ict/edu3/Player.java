package com.ict.edu3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Player implements Runnable {
    // 인자를 받을때는 전역변수로 빼준다. 무조건!
	Socket s;
	Server server;
	
	InputStream in;
	InputStreamReader isr;
	BufferedReader br;
	
	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	String ip;
	
	public Player() {}
	public Player(Socket s, Server server) {
		// 받은 인자를 쓸 수 있도록 전역변수와 연결
		this.s = s;
		this.server = server;
		
		// 입출력 준비를 끝낸다.
		try {
			in = s.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			out = s.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if (msg.equalsIgnoreCase("exit")) {
					System.out.println("BYE~");
					break;
				} else {
					server.sendMsg(ip + " : " + msg);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		new Player();
	}
}
