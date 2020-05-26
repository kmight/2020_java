package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		String pathname1 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"video.mp4";
		File file1 = new File(pathname1);
		
		String pathname2 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"video_ex.mp4";
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			int k = 0;
			while ((k = fis.read()) != -1) {
				fos.write(k);
			}
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
				if (fis != null) fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
}
