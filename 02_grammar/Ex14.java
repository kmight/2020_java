class Ex14{
	public static void main(String[] args){
		// �񱳿����� : >, <, >=, <=, ==(����), !=(�����ʴ�=�ٸ���)
		// �񱳿����ڸ� ����� �� �ִ� �ڷ��� : char, ����, �Ǽ�
		// ���� ����� boolean��(true, false) = ���ǽĿ� ���ȴ�.
		
		int su1 = 90;
		int su2 = 80;

		char su3 = 'a';
		char su4 = 'A';

		double su5 = 97.0;
		double su6 = 78.0;
		
		boolean result = su1 > su2 ;
		System.out.println("���1 : " + result);

		result = su3 > su4 ;
		System.out.println("���2 : " + result);

		result = su5 > su6 ;
		System.out.println("���3 : " + result);

		result = su1 > su3 ;
		System.out.println("���4 : " + result);

		result = su1 > su5 ;
		System.out.println("���5 : " + result);

		result = su3 == su5 ;
		System.out.println("���6 : " + result);		
	}
}