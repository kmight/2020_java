package com.ict.edu8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"io11.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		String pathname2 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"io12.txt";
		File file2 = new File(pathname2);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			ArrayList<VO> list = (ArrayList<VO>)(ois.readObject());
			for (VO k : list) {
				System.out.print(k.getName()+"\t");
			    k.s_calc();
			    System.out.print(k.getSum()+"\t");
			    System.out.print(k.getAvg()+"\t");
			    System.out.println(k.getHak()+"\t");
			    
			    bw.write(k.getName()+"\t");
			    bw.write(k.getSum()+"\t");
			    bw.write(k.getAvg()+"\t");
			    bw.write(k.getHak()+"\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			System.out.println("e1 :" + e);
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println("e2 : " + e2);
			}
		}
	}
}
