package com.ict.edu3;

public class TestMain {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();
		
		// testA testB는 Runnable를 가지고 구현하였으므로
		// start()가 없다.
		// start() => run() 으로 가지 않으면 스레드 처리가 아니다.
		
		// start()는 Thread클래스가 가지고 있으므로
		// Thread클래스를 활용해야 된다.
		
		// 방법 1 : Runnable를 상속받은 객체를 Thread생성자에 넣어준다.
		Thread thread = new Thread(testA);
		thread.start();
		
		new Thread(testB).start();
		
		// 방법 2 : 안드로이드에서 사용하는 방법(익명내부클래스)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ": 가가가가가ㅏ가가");
				}
			}
		}).start();
	}
}
