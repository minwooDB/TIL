package Day2;

public class ForLab2 {
	/*1. ForLab1 �̶�� Ŭ������ �ϳ� �����.
	2. int Ÿ������ evenNum ������ oddNum ������ �����Ѵ�.
	3. 1 ���� 100 ������ �� �߿��� 
	   ¦���� ���� evenNum �� �����ϰ� 
	   Ȧ���� ���� oddNum �� �����Ѵ�.
	4. ���� ����� ������ ���� ����Ѵ�.

	    1���� 100������ ���ڵ� �߿��� 
	    ¦���� ���� XXX �̰� 
	    Ȧ���� ���� YYY �̴�.*/
	public static void main(String[] args) {
		int evenNum=0, oddNum=0;
		for(int i=0;i<=100;i++) {
			if(i % 2==0) 
				evenNum+=i;
			else 
				oddNum+=i;
			}
		System.out.println("1���� 100������ ���ڵ� �߿��� ");
		System.out.println("¦���� ����"+evenNum+"�̰�,");
		System.out.println("Ȧ���� ����"+oddNum+"�̴�.");
			}
	}