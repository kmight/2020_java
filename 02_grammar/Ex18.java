
public class Ex18 {
	public static void main(String[] args) {
		// ���׿�����(���ǿ�����)
		// - ���� : ���庯�� = ���ǽ� ? ���϶� ���๮�� : �����ϋ� ���๮��;
		// - ���ǽĿ� ���� ������ boolean�� -> �񱳿���, ������, boolean
		// - ���庯��, ���϶� ������, �����ϋ� ������ ��� ���� �ڷ����̾�� �Ѵ�.

		String res = true ? "�հ�" : "���հ�";
		System.out.println(res);

		// ���庯��, ���϶� ������, �����϶� ������ ��� ���� �ڷ���
		// res = false ? 10 : "B";
		// System.out.println(res);
		
		// ���ܻ���
		int point1 = true ? 10 : 20;
		long point2 = true ? 10 : 20;
		double point3 = true ? 10 : 20.7;		
		
		// ����� 90�� �̻��̸� 'A', �ƴϸ� 'B'
		double avg = 87.6;
		int result = (avg >= 90) ? 'A' : 'B';
		System.out.println("��� : " + (char)result);
		
	}
}
