package test;

public class Ex21 {
	public static void main(String[] args) {
		int time = 10;
		int danga = 8590;
		int pay = 0;
		
		if (time >= 8) {
			pay = ( (time * danga) + (int)((time * danga) * 1.5));
		} else {
			pay = time * danga;
		}
		
		System.out.println("10시간 근무, 받아야 할 돈은 " + pay + " 입니다.");
	}
}
