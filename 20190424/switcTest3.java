package day2;

public class switcTest3 {
	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
		String season = null;
		/*month==12, month==1.month==2
		 System.out.println(month+";겨울:");ㅣ\
		 month==3,month==4.month==5
		 System.out.println)(month+":봄");
		 month==6,month==7.month==8
		 System.out.println)(month+":여름");
		 그외의 모든 경우
		 System.out.println(month+":가을")*/
		switch(month) {
		case 12: case 1: case 2:
		season = "겨울"; break;
		case 3: case 4: case5:
		season = "봄"; break;
		case 6: case 7: case 8:
		season = "여름"; break;
		case 9:case 10:case 11:
		season = "가을"; break;
		}
	System.out.println(month+"월은 "+season);
	}
}
	
