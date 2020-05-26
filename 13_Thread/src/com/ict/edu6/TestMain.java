package com.ict.edu6;

public class TestMain {
	public static void main(String[] args) {
		Car car = new Car(); // 자동차 창고가 만들어 진다.
		
		Customer customer = new Customer(car);
		Producer producer = new Producer(car);
		
		// Runnable은 start()가 없으므로 실행시키기 위해선 Thread 의 도움이 필요하다.
		new Thread(producer).start();
		new Thread(customer).start();

		
	}
}
