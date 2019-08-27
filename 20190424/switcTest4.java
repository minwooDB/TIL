package day2;

public class switcTest4 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101); //0~100
		char grade;
		switch(score/10) {
		case 10: case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F'; break;
		}
	   System.out.println(score + "점은"+grade+"등급");
	}
}
	
