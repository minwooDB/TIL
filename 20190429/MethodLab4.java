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
public class MethodLab4 {
	/*1. 클래스명 : MethodLab4
	2. 정의해야 하는 메서드  
	   메서드명 : maxNumArray
	   매개변수 타입 : int[]
	   리턴값의 타입 : int

	   매개변수에 전달된 배열의 원소값들 중에서 가장 큰값 리턴
	   
	3. main() 메서드에서 maxNumArray 를 3번 호출한다.
	   다음 배열들을 전달하여
	     배열 1 : 10, 20, 30
	     배열 2 : 100, 500, 300, 200, 400
	     배열 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
	   
	   호출하고 리턴값을 다음과 같이 출력한다.
	     가장 큰 값은 30 입니다.
	     가장 큰 값은 500 입니다.
	     가장 큰 값은 10 입니다.*/
	public static void main(String[] args) {
	int[] arr1={10,20,30};
	int[] arr2={100,500,300,200,400};
	int[] arr3={1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
	 System.out.println("가장 큰 값은"+maxNumArray(arr1)+"입니다.");
	 System.out.println("가장 큰 값은"+maxNumArray(arr2)+"입니다.");
	 System.out.println("가장 큰 값은"+maxNumArray(arr3)+"입니다.");
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
