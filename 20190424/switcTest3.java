package day2;

public class switcTest3 {
	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
		String season = null;
		/*month==12, month==1.month==2
		 System.out.println(month+";�ܿ�:");��\
		 month==3,month==4.month==5
		 System.out.println)(month+":��");
		 month==6,month==7.month==8
		 System.out.println)(month+":����");
		 �׿��� ��� ���
		 System.out.println(month+":����")*/
		switch(month) {
		case 12: case 1: case 2:
		season = "�ܿ�"; break;
		case 3: case 4: case5:
		season = "��"; break;
		case 6: case 7: case 8:
		season = "����"; break;
		case 9:case 10:case 11:
		season = "����"; break;
		}
	System.out.println(month+"���� "+season);
	}
}
	
