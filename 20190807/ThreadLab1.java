package threadexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Thread;


public class ThreadLab1 {
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1();
		ThreadEx2 t2 = new ThreadEx2();	 
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

class ThreadEx1 extends Thread {
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
class ThreadEx2 extends Thread {
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