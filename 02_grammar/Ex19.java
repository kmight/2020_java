
public class Ex19 {
	public static void main(String[] args) {
		// ���׿����� ������ 
		// int k1�� Ȧ������ ¦������ �Ǻ�����
		int k1 = 7;
		String result = (k1%2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("k1�� " + result + " �Դϴ�");
		
		// int k2�� 60���̻��̸� �հ�, �ƴϸ� ���հ� �Ǻ�����
		int k2 = 76;
		result = (k2 >= 60) ? "�հ�" : "���հ�";
		System.out.println("k2�� " + result + " �Դϴ�");
		
		// char k3 = �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'h';
		result = (k3 >= 'A' && k3 <= 'Z') ? "�빮��" : "�빮�� �ƴ�";
		System.out.println("k3�� " + result + " �Դϴ�");
		
		// �ٹ��ð��� 8�ð������� �ð��� 8590���̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?
		int hourPay = 8590;
		int workHour = 10;
		//double totalPay = (workHour <= 8) ? hourPay * workHour : (hourPay * 8) + (hourPay * (workHour - 8) * 1.5);
		//System.out.println("���� �ݾ� : " + (int)totalPay + " ��");
		int totalPay = (workHour <= 8) ? hourPay * workHour : (int)((hourPay * 8) + (hourPay * (workHour - 8) * 1.5));
		System.out.println("���� �ݾ� : " + totalPay + " ��");
		
	}
}
