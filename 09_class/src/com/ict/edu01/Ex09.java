package com.ict.edu01;

interface I {
	public void play();
}

class Bumper_Car implements I {
	@Override
	public void play() {
		System.out.println("나 범퍼카임");
	}
}

class BaseBall implements I {
	@Override
	public void play() {
		System.out.println("나 야구게임임");
	}
}

class K_land {
	void autoPlay(I i) {
		i.play();
	}
}

public class Ex09 {
	public static void main(String[] args) {
		K_land k_land = new K_land();
		//I i = new I(); // inteface는 객체를 만들 수 없다
		k_land.autoPlay(new I() {
			public void play() {
				System.out.println("회전목마");
			}
		});
		System.out.println("===================");
		
		k_land.autoPlay(new Bumper_Car());
		k_land.autoPlay(new BaseBall());
		System.out.println("===================");
		
		int k = 2;
		
		I i = null;
		if (k == 1) {
			i = new Bumper_Car();
		} else if(k == 2) {
			i = new BaseBall();
		} // if
		
		k_land.autoPlay(i);
		System.out.println("===================");
		
		
		
	} // main
} // class
