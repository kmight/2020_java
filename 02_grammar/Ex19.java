
public class Ex19 {
	public static void main(String[] args) {
		// 삼항연산자 예제들 
		// int k1가 홀수인지 짝수인지 판별하자
		int k1 = 7;
		String result = (k1%2 == 0) ? "짝수" : "홀수";
		System.out.println("k1은 " + result + " 입니다");
		
		// int k2가 60점이상이면 합격, 아니면 불합격 판별하자
		int k2 = 76;
		result = (k2 >= 60) ? "합격" : "불합격";
		System.out.println("k2는 " + result + " 입니다");
		
		// char k3 = 대문자인지, 대문자가 아닌지 판별하자
		char k3 = 'h';
		result = (k3 >= 'A' && k3 <= 'Z') ? "대문자" : "대문자 아님";
		System.out.println("k3는 " + result + " 입니다");
		
		// 근무시간이 8시간까지는 시간당 8590원이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		int hourPay = 8590;
		int workHour = 10;
		//double totalPay = (workHour <= 8) ? hourPay * workHour : (hourPay * 8) + (hourPay * (workHour - 8) * 1.5);
		//System.out.println("받을 금액 : " + (int)totalPay + " 원");
		int totalPay = (workHour <= 8) ? hourPay * workHour : (int)((hourPay * 8) + (hourPay * (workHour - 8) * 1.5));
		System.out.println("받을 금액 : " + totalPay + " 원");
		
	}
}
