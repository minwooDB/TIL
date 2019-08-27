package Day3;
public class TimeTest {
	/*1. TimeTest 라는 클래스를 생성한다.
	2. time 이라는 변수를 선언하여 32150(초) 이라는 값을 초기화 한다.   
	3. time 변수의 값으로 "XX시간 XX분 XX초" 형식으로 변환하여 출력한다.*/
	public static void main(String[] args) {
		int time=32150;	
		System.out.println(time/3600+"시간"+(time%3600)/60+"분"+time%60+"초");
	}
}
