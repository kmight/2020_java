class Ex12{
	public static void main(String[] args){
		// 3989초는 몇시간, 몇분, 몇초인가?
		int time = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0; // 나머지

		// 시간 구하기 (3600을 나눈 몫이 시간
		h = time / 3600; // 정수/정수 => 정수(몫)
		System.out.println(h + " 시간");

		// 나머지 구하기
		res = time % 3600;
		
		// 분 구하기 = 몫
		m = res / 60;
		System.out.println(m + " 분");

		// 초 구하기
		s = res % 60;
		System.out.println(s + " 초");

		// 출력하기
		System.out.println(time + "초는 " + h + "시 " + m + "분 " + s + "초");
	}
}