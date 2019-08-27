package threadexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Runnable;

public class ThreadLab2 {
	public static void main(String[] args) {
		Runnable r1  = new ThreadEx1_11();
		Thread   t1 = new Thread(r1);
		Runnable r2  = new ThreadEx2_22();
		Thread   t2 = new Thread(r2);	 
		t1.start();
		t2.start();
		for(int i=0; i<10; i++) {
			System.out.println("number of milliseconds since January 1, 1970, 00:00:00 GMT");
			try {
				Thread.sleep(3000);
			} catch(Exception e ) { }
		}
	}
}

class ThreadEx1_11 implements Runnable {
	public void run() {
		SimpleDateFormat format1 = new SimpleDateFormat ( "오늘은 MM월 dd일 입니다.");
		Date time = new Date();
		String time1 = format1.format(time);
		for(int i=3; i > 0; i++) {
			System.out.println(time1);
			try {
				Thread.sleep(10000);
			} catch(Exception e ) { }
		}
	}
}
class ThreadEx2_22 implements Runnable {
	public void run() {
		SimpleDateFormat format2 = new SimpleDateFormat ( "HH시mm분ss초");
		Date time = new Date();
		String time2 = format2.format(time);
		for(int i=0; i < 5; i++) {
		   System.out.println(time2);
		   try {
				Thread.sleep(5000);
			} catch(Exception e ) { }
		}
	}
}