package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// for(�ʱ��; ���ǽ�; ������){
		// ���ǽ��� ���϶� ������ ����;
		// }
		// for���� ������ �ʱ�ĺ��� �����Ѵ�. ���ǽ����� �̵�
		// ���ǽ��� boolean��(boolean, �񱳿���, ������)
		// ���ǽ��� ���̸� for�� ���� ����� �����Ѵ�.
		// ���ǽ��� �����̸� for�� �������� �ʴ´�.
		// for���� ���� ������ ������ ���������� ����.
		// �������� �ʱ���� �����ϰų� ���ҽ�Ű�� ������ �ϰ�
		// �ٽ� ���ǽ����� ����.

		// �ڹٿ����� if��, switch��, for�� �ȿ��� ���� ������
		// �ۿ��� ����� �� ����.

		// �ȳ��ϼ��� ���� ����ϱ�
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = Hello");
		} // for
		System.out.println("============================");

		// 0 ~ 10 ���� ����ϱ�
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		} // for
		System.out.println("============================");

		// 0 ~ 10 ���� ¦���� ����ϱ�
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		} // for

		// 0 ~ 50���� 7�� ��� ���
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		} // for

		// a ~ g
		for (char i = 'a'; i <= 'g'; i++) {
			// ������ ����ϱ�, /t�� tab(���� ���� ����)�� �ǹ�
			System.out.print(i + "\t");
		} // for
		System.out.print("����\n�ٶ�");
		// �� �� ����
		System.out.println(); // �ٹٲ� ����� �־� ���ڰ� �� �ȴ�.
		// �������� �ʴ� �޼ҵ�
		// System.out.print(); // print() <- ���ڸ� �ݵ�� �־�� �Ѵ�.

		// System.out.println() : �� �ٲٱ�
		// System.out.print() : �������� ����
		// System.out.println(������ ������) : ��� �� �� �ٲٱ�
		// System.out.print(������ ������) : ������ ����ϱ�

		// 5�� ����ϱ�
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0		
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("===================");
		for (int i = 1; i < 17; i++) {
			if(i%4 == 0) {	
			    System.out.println("0");
			} else {
			    System.out.print("0 ");	
			}
		
		}
		System.out.println();
		System.out.print("\\ \\ \" \' \\\n");
		System.out.println();
		
		// ������ (�հ�)
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("������ : " + sum);
		
		// 0 ~ 10 Ȧ���� �հ�
		int odd = 0;
		for (int i = 1; i < 11; i++) {
			if(i%2 != 0) {
				odd += i;
			}
		}
		System.out.println("Ȧ�� ������ : " + odd);
		
		// 0 ~ 10 ¦���� �հ�
		int even = 0;
		for (int i = 1; i < 11; i++) {
			if(i%2 == 0) {
				even += i;
			}
		}
		System.out.println("¦�� ������ : " + even);

		// 0 ~ 10 Ȧ��, ¦���� �հ�
		odd = 0;
		even = 0;
		for (int i = 1; i < 11; i++) {
			if(i%2 != 0) {
				odd += i;
			} else {
				even += i;
			}
		}
		System.out.println("Ȧ�� ¦�� ������ : " + (int)(odd + even));
		
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum *= i;
		}
		System.out.println("7! = " + sum);
		
	} // main
} // class
