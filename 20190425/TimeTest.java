package Day3;
public class TimeTest {
	/*1. TimeTest ��� Ŭ������ �����Ѵ�.
	2. time �̶�� ������ �����Ͽ� 32150(��) �̶�� ���� �ʱ�ȭ �Ѵ�.   
	3. time ������ ������ "XX�ð� XX�� XX��" �������� ��ȯ�Ͽ� ����Ѵ�.*/
	public static void main(String[] args) {
		int time=32150;	
		System.out.println(time/3600+"�ð�"+(time%3600)/60+"��"+time%60+"��");
	}
}
