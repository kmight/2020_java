package com.ict.edu4;

// 데몬 스레드 : 일반 스레드와 작업을 돕는 보조적인 역할을 수행하는 스레드
//				일반 스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨
public class Ex01 implements Runnable {
	boolean autoSave = false;
	@Override
	public void run() {
		while(true) {

			    try {
			    	// 3초마다 대기 상태
					Thread.sleep(1000*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    System.out.println(Thread.currentThread().getName() + " : run()");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : 프로그램 시작");		
		
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		thread.setDaemon(true);
		thread.start();
		
		for (int i = 1; i < 15; i++) {
			try {
				Thread.sleep(1000*1);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
		System.out.println(Thread.currentThread().getName() + " : 프로그램 종료");
	}

}
