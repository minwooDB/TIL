
  package lamdaexam;
 
 import java.text.SimpleDateFormat; 
import java.util.Date;
  
  import innerexam.InnerTest4;
  
  import java.lang.Runnable;
  
public class LambdaThreadLab{
		
	  public static void main(String[] args) {
	 
	  SimpleDateFormat format1 = new SimpleDateFormat ( "오늘은 MM월 dd일 입니다."); 
	  SimpleDateFormat format2 = new SimpleDateFormat ( "HH시mm분ss초"); 
	  Date time = new Date(); 
	  String time1 = format1.format(time);
	  String time2 = format2.format(time);
	  
	  Thread t1 = new Thread(()-> {  
	  for(int i=3; i > 0; i++) {
	  System.out.println(time1);
	  try { Thread.sleep(10000); }
	  catch(Exception e ) {}
	   System.out.println(time1);
	  } } ); 
	  
	  Thread t2 = new  Thread(()-> { 
	  for(int i=3; i > 0; i++) {
	  System.out.println(time1);
	  try { Thread.sleep(10000); } 
	  catch(Exception e ) {}
	  System.out.println(time2);
	  } 
	}); 
	  t1.start();
	  t2.start();
	  for(int i = 0;i<10;i++){
		  try {Thread.sleep(3000); }catch( Exception e) { } 
		  System.out.println("number of milliseconds since January 1, 1970, 00:00:00 GMT");
		  }
	  }
	  }