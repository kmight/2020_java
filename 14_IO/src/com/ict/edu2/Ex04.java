package com.ict.edu2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ex04 {
	public static void main(String[] args) {
		
		String pathName 
		= "C:"+File.separator+"study"+File.separator+"util"+File.separator+"io02.txt";
		
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			String str = "Phone\n010-6722-9240\n이름 : 정복교\nage : 48";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if (fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
