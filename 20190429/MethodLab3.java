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
public class MethodLab3 {
	public static void main(String[] args) {
	 int arr[]= {10,5,7,15};
	 twoValue(arr);
	 
	}
	static void twoValue(int[]jumsu){
		for(int i=0;i<jumsu.length;i++)
			jumsu[i] =jumsu[i]*2;
	}
	static void printrray(int[] jumsu){
		for(int data:jumsu)
			System.out.print(data+" ");
		System.out.println();
}
}
