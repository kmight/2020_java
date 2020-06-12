package com.ict.edu3;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendThread implements Runnable{
	Socket s;
	Scanner sc = new Scanner(System.in);
	
	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	public SendThread(Socket s) {
		try {
			this.s = s;
			// 출력 준비
			out = s.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(1);
				System.out.print("입력 : ");
				String msg = sc.nextLine();
				msg += System.getProperty("line.separator");
				
				bw.write(msg);
				bw.flush();
			}
		} catch (Exception e) {
		}
	}
}
