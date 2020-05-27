package com.ict.edu5;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// OutputStreamWriter : OutputStream => Writer (바이트 => 문자스트림)
// OutputStream => OutputStreamWriter => writer => BufferedWriter
public class Ex02 {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;		
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);	
			
			bw.write("Welcome 대韓민국 !!!");
			
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
