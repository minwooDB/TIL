/*
1. Ŭ������ : MethodLab3

2. �����ؾ� �ϴ� �޼���
    public static int getRandom(int n) 
	1 ���� n ���� ������ ���� ����
    public static int getRandom(int n1, int n2) 
	n1 ���� n2 ������ ���� ����

3. main() �޼���
       getRandom(10) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
	x, x, x, x, x

       getRandom(10, 20) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
	x, x, x, x, x
 */
package Day5;
public class MethodLab4 {
	/*1. Ŭ������ : MethodLab4
	2. �����ؾ� �ϴ� �޼���  
	   �޼���� : maxNumArray
	   �Ű����� Ÿ�� : int[]
	   ���ϰ��� Ÿ�� : int

	   �Ű������� ���޵� �迭�� ���Ұ��� �߿��� ���� ū�� ����
	   
	3. main() �޼��忡�� maxNumArray �� 3�� ȣ���Ѵ�.
	   ���� �迭���� �����Ͽ�
	     �迭 1 : 10, 20, 30
	     �迭 2 : 100, 500, 300, 200, 400
	     �迭 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
	   
	   ȣ���ϰ� ���ϰ��� ������ ���� ����Ѵ�.
	     ���� ū ���� 30 �Դϴ�.
	     ���� ū ���� 500 �Դϴ�.
	     ���� ū ���� 10 �Դϴ�.*/
	public static void main(String[] args) {
	int[] arr1={10,20,30};
	int[] arr2={100,500,300,200,400};
	int[] arr3={1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
	 System.out.println("���� ū ����"+maxNumArray(arr1)+"�Դϴ�.");
	 System.out.println("���� ū ����"+maxNumArray(arr2)+"�Դϴ�.");
	 System.out.println("���� ū ����"+maxNumArray(arr3)+"�Դϴ�.");
	}
	static int maxNumArray(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
