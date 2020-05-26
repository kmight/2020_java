package com.ict.edu6;

public class Producer implements Runnable{
	
	private Car car;
	
	public Producer(Car car) { // 생성자 - 인자가 있음
		this.car = car;
	}



	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 10; i++) {
			// 자동차 생산
			carName = car.getCar();
			// 자동차 
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
