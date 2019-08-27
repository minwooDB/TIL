package Day3;

public class Array2 {
	/*1. ArrayLab2 라는 클래스를 하나 만든다.
2. 'J', 'a', 'v', 'a' 라는 원소들로 구성되는 char 타입의 배열을
   만든다.
3. 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 
    변환한다.
4. 수행 결과 :

    변환된 배열 : j,A,V,A*/
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