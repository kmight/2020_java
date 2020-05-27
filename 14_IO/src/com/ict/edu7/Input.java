package com.ict.edu7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.ict.edu7.VO;

public class Input {
	public static void main(String[] args) {
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io10.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject(); // readObject()의 반환형이 Object이므로 VO의 자료형으로 형변환한다.
			for (VO k : list) {
				System.out.print(k.getName() + " ");
				System.out.print(k.getAge() + " ");
				System.out.print(k.getWeight() + " ");
				System.out.println(k.isGender());	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
