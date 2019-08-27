package Day2;

public class ForLab1 {
	/*orLab3 라는 클래스를 하나 만든다.
1. char 타입으로 변수를 하나 만들어 '&'로 초기화 한다.
2. 5부터 10사이의 난수를 하나 추출한다.
3. 추출된 숫자가 5라면 반복문을 사용하여 다음과 같이 출력한다.*/
	public static void main(String[] args) {
		char ch='&';
		int num=(int)(Math.random()*6)+5;	
			for(int i=0;i<num;i++) {
				for(int j =0;j <=i;j++) 
					System.out.println(ch);
			}
			
		}
		}