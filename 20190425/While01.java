package Day3;
/*1. WhileLab2 �̶�� Ŭ������ �����Ѵ�.
2. 0���� 30������ ������ �����Ѵ�.
    ����� ���ڰ� 1�̸� 'A', 2 �̸� 'B', ... 26�̸� 'Z' �� ����ϴµ�
    ��� ���� ����� ��������� �ݺ��ϴٰ� ������ 0�� ����ǰų�
    27~30�� ����Ǹ� �ݺ��� ������.
    �ݺ��ϴ� ���� ������� :*/
public class While01 {
	public static void main(String[] args) {
		int i=1;
		while(true) {
			int num=(int)(Math.random()*31);
			if(num==0 || num>26)
			break;
			System.out.println((char)(num + 64) + "(" + num + ")");
			i++;
			}
		System.out.println("����Ƚ���� " + (i - 1) + "���Դϴ�.");
	
		}
	}
