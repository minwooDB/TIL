package Day3;

public class Array01 {
	/*1. ArrayLab1 �̶�� Ŭ������ �ϳ� �����.
2. 10���� ����(����)�� ������ �� �ִ� �迭�� �ϳ� �����.
3. ������ ���ҿ�  4���� 20������ ������ �����Ͽ� �����Ѵ�.
4. ��� ������ ���� ���Ѵ�.
5. ������ ���� �������� ����Ѵ�.

    ��� ������ �� : x,x,x,x,x,x,x,x,x,x
    ��� ������ �� : x*/
	public static void main(String[] args) {
		int[] arr= new int[10];
		int sum=0;
		System.out.print("��� ������ ��:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*17)+4;
			System.out.print(arr[i]);
			if(arr.length-1>i)
			System.out.print(',');
		}
			System.out.println(' ');
			for(int i=0;i<arr.length;i++)
				sum+=arr[i];
			System.out.println("��� ������ ��:"+sum);
			}
				
		
			}