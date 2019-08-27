package Day6;
/*Member3 객체 (인스턴스)를 3개 생성하고 
각각의 멤버 변수에 정보를 저장한 후에 
각각 정보를 추출하여 다음 형식으로 출력하는 Member3TeobjA 클래스를 구현한다.

	회원1 : 이름(계정,패스워드,생년)
	회원2 : 이름(계정,패스워드,생년)
	회원3 : 이름(계정,패스워드,생년)
*/
class Member3{
	String name;
	String account;
	String passwd;
	int	birthyear;
	int num;
	Member3(){
		System.out.println("객체 생성");
	   
	}
	Member3(String n, String a, String p, int by){
		name = n;
		account = a;
		passwd = p;
		birthyear = by;
	}
	String getMember3Info() {
		return "회원"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class Member3 {
		Member3 objA[] = new Member3 [3];
		objA[0] = new Member3("이민우"+"010","")
		objA[1].name = "이민우";
		objA[2].account = "alsdn11456";
		System.out.println(objA[0].getMember3Info());
		System.out.println(objA[0]);
		objA[1] = new Member3();
		objA[1].name = "이진우";
		objA[1].account = "진우11456";
		objA[1].passwd = "진우";
		objA[1].num = 2;
		objA[1].birthyear = 990812;
		System.out.println(objA[1].getMember3Info());
		System.out.println(objA[1]);
		objA[2] = new Member3();
		objA[2].name = "건호";
		objA[2].account = "건호1156";
		objA[2].passwd = "건호";
		objA[2].num = 3;
		objA[2].birthyear = 10812;
		System.out.println(objA[2].getMember3Info());
		System.out.println(objA[2]);
	}
}