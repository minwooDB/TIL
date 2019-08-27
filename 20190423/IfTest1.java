package Day1;

public abstract class IfTest1 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		
		if(score >= 90) System.out.println(score + "점은 A등급");
		else if(score >= 80) System.out.println(score + "점은 B등급");
		else if(score >= 70) System.out.println(score + "점은 C등급");
		else if(score >= 60) System.out.println(score + "점은 D등급");
		else System.out.println(score + "점은 F등급");	
	}
}
