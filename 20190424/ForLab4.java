package Day2;

public class ForLab4 {
	/*
	 * 1. char Ÿ������ ������ �ϳ� ����� '&'�� �ʱ�ȭ �Ѵ�.
	2. 5���� 10������ ������ �ϳ� �����Ѵ�.
	3. ����� ���ڰ� 5��� �ݺ����� ����Ͽ� ������ ���� ����Ѵ�.
	 */
		public static void main(String[] args) {
			char ch = '&';
			int rNum = (int)(Math.random()*6)+5;
			for(int i = 0; i <rNum;i++) {
				for(int j = 0; j <=i ;j++)
					System.out.print(ch);
				System.out.println();
			}
		}
}