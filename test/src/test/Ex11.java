package test;

import java.util.Random;

public class Ex11 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int su = (int)(ran.nextFloat() * 10) + 1;
		
		System.out.println(su);
		
	}
}
