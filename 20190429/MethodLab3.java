/*
1. 클래스명 : MethodLab3

2. 구현해야 하는 메서드
    public static int getRandom(int n) 
	1 부터 n 까지 범위의 난수 리턴
    public static int getRandom(int n1, int n2) 
	n1 부터 n2 범위의 난수 리턴

3. main() 메서드
       getRandom(10) 을 5번 호출하고 리턴값을 하나의 행에 출력
	x, x, x, x, x

       getRandom(10, 20) 을 5번 호출하고 리턴값을 하나의 행에 출력
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
