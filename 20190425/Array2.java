package Day3;

public class Array2 {
	/*1. ArrayLab2 ��� Ŭ������ �ϳ� �����.
2. 'J', 'a', 'v', 'a' ��� ���ҵ�� �����Ǵ� char Ÿ���� �迭��
   �����.
3. �� ���ҵ��� ������ �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� 
    ��ȯ�Ѵ�.
4. ���� ��� :

    ��ȯ�� �迭 : j,A,V,A*/
	public static void main(String[] args) {
		char arr[] = {'J','a','v','a'}; 
		for(int i=0;i<arr.length;i++) {	
		if((int)arr[i] >= 97)
			arr[i]-=32;
		else
			arr[i]+=32;
		}
		for(int i=0;i<arr.length;i++)
		if(i!=arr.length-1)
			System.out.print(" "+arr[i]+',');
		else
			System.out.print(" "+arr[i]);
			}
			}