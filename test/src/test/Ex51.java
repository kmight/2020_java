package test;

import java.util.Calendar;

public class Ex51 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int toYear = cal.get(Calendar.YEAR);
		int toMonth = cal.get(Calendar.MONTH) + 1;
		int toDay = cal.get(Calendar.DATE);
		int toDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	
		int nowHour = cal.get(Calendar.HOUR);
		int nowMinute = cal.get(Calendar.MINUTE);
		int nowSecond = cal.get(Calendar.SECOND);
		
		String yoIl = "";
		
		switch(toDayOfWeek) {
		case 1 : yoIl = "일"; break;
		case 2 : yoIl = "월"; break;
		case 3 : yoIl = "화"; break;
		case 4 : yoIl = "수"; break;
		case 5 : yoIl = "목"; break;
		case 6 : yoIl = "금"; break;
		case 7 : yoIl = "토"; break;
		}
		
		System.out.print("현재 ");
		System.out.print(toYear + "년 ");
		System.out.print(toMonth + "월 ");
		System.out.print(toDay + "일 ");
		System.out.print(yoIl + "요일 ");
		System.out.print(nowHour + "시 ");
		System.out.print(nowMinute + "분 ");
		System.out.print(nowSecond + "초 ");
		System.out.print("입니다. ");
		
	}
}
