package Day5;

public class MethodLab2 {
	/*
	 * 1. Ŭ������ : MethodLab2
	 * 
	 * 2. �����ؾ� �ϴ� �߰� �޼��� (static �ٿ���) �Ű����� : int Ÿ������ 2 �� ���ϰ� : int Ÿ������ 1�� �޼����
	 * :���Ƿ� ��� : ���޹��� 2���� ������ �߿��� ū ������ ���� ���� ���� ���� �� ���� �����ϸ� 0 �� �����Ѵ� 10, 20 �� ���޵Ǹ�
	 * ---> 10 ���� 20, 5 �� ���޵Ǹ� ---> 15 ���� 5, 30 �� ���޵Ǹ� ---> 25 ���� 6, 3 �� ���޵Ǹ� ---> 3
	 * ����
	 * 
	 * 3. main() �޼��忡���� 1���� 30 ������ ���� 2 ���� �����Ͽ� 2������ ������ �޼��带 ����� ������ ���� �������� ����Ѵ�.
	 * "X �� Y �� ���� W �Դϴ�." ----> 5 ȸ �ݺ� ���ο��� �޼��� 5�� ȣ��
	 */
	public static void main(String[] args) {
		int a, b;
		for (int i = 0; i < 5; i++) {
			a = (int) (Math.random() * 30) + 1;
			b = (int) (Math.random() * 30) + 1;
			System.out.println(a + "��" + b + "�� ����" + gap(a, b) + "�Դϴ�.");
		}
	}
	static int gap(int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}
}
