class Ex13{
	public static void main(String[] args){
		// 2�ð� 40�� 30�ʴ� �� ���ϱ��?
		int totalSeconds = 0;
		int secondsHour = 2 * 60 * 60;
		int secondsMin = 40 * 60;
		int secondsSec = 30;

		totalSeconds = secondsHour + secondsMin + secondsSec;
		System.out.println("2�ð� 40�� 30�ʴ� " + totalSeconds + " �� �Դϴ�.");
	}
}