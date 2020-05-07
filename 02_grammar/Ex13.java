class Ex13{
	public static void main(String[] args){
		// 2시간 40분 30초는 몇 초일까요?
		int totalSeconds = 0;
		int secondsHour = 2 * 60 * 60;
		int secondsMin = 40 * 60;
		int secondsSec = 30;

		totalSeconds = secondsHour + secondsMin + secondsSec;
		System.out.println("2시간 40분 30초는 " + totalSeconds + " 초 입니다.");
	}
}