package Day5;

public class MethodLab1 {
/*
2. �����ؾ� �ϴ� �߰� �޼��� (static �ٿ���)
   �Ű����� : char Ÿ�� 1��, int Ÿ�� 1 �� 
   ���ϰ� : ����
   �޼���� : ���Ƿ�
   ��� : ù��° �ƱԸ�Ʈ�� ���޵� ���ڸ� 
            �ι�° �ƱԸ�Ʈ�� ���޵� ������ ������ŭ 
            �� �࿡ ����Ѵ�.
3. main() �޼��忡���� ������ ���� �ƱԸ�Ʈ�� �����ϸ鼭
    ���� ������ �޼��带 ȣ���Ѵ�.

     xxxx('@', 3)
     xxxx('%', 4)
     xxxx('A', 5)
     xxxx('��', 3)
    ���
         @@@
         %%%%
         AAAAA  
         ������*/
	public static void main(String[] args) {
		
		printa('@', 3);
		printa('%', 4);
		printa('A', 5);
		printa('��', 3);
	}
	static void printa(char ch,int num) {
		for(int i=1; i<=num;i++) {
		System.out.print(ch); 
		}
		System.out.println();
		}
}
