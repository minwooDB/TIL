package Day3;
/*1. WhileLab1 �̶�� Ŭ������ �����Ѵ�.
2. 5���� 10������ ������ �����Ѵ�.
3. 1���� ����� ���ڰ������� �� ���ڵ��� �������� ������� ����Ѵ�.
   (for �� while �� ���� �����Ѵ�.)
   ===>  7�� ����Ǹ�
    [ for ��� ]
     1 -> 1
     2 -> 4
     3 -> 9
     4 -> 16
     5 -> 25
     6 -> 36
     7 -> 49
    [ while ��� ]
     1 -> 1
     2 -> 4
     3 -> 9
     4 -> 16
     5 -> 25
     6 -> 36
     7 -> 49*/
public class While2 {
	public static void main(String[] args) {
		System.out.println("[for ���]");
		int num=(int)(Math.random()*6)+5;
		for(int i=1;i<=num;i++) {
			System.out.println(i+"->"+i*i);
		}
		System.out.println("[while ���]");
		int i=1;
		while(i<=num) {
			System.out.println(i+"->"+i*i);
			i++;
			
		}
	}
}
