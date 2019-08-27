package Day6;
/*Member 객체 (인스턴스)를 3개 생성하고 
각각의 멤버 변수에 정보를 저장한 후에 
각각 정보를 추출하여 다음 형식으로 출력하는 MemberTest 클래스를 구현한다.

	회원1 : 이름(계정,패스워드,생년)
	회원2 : 이름(계정,패스워드,생년)
	회원3 : 이름(계정,패스워드,생년)
*/
class Member{
	String name;
	String account;
	String passwd;
	int	birthyear;
	int num;

	String getMemberInfo() {
		return "회원"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class Object2 {
	public static void main(String[] args) {
		Member st1 = new Member();
		st1.name = "이민우";
		st1.account = "alsdn11456";
		st1.passwd = "민우";
		st1.num = 1;
		st1.birthyear = 920812;
		System.out.println(st1.getMemberInfo());
		System.out.println(st1);
		Member st2 = new Member();
		st2.name = "이진우";
		st2.account = "진우11456";
		st2.passwd = "진우";
		st2.num = 2;
		st2.birthyear = 990812;
		System.out.println(st2.getMemberInfo());
		System.out.println(st2);
		Member st3 = new Member();
		st3.name = "건호";
		st3.account = "건호1156";
		st3.passwd = "건호";
		st3.num = 3;
		st3.birthyear = 10812;
		System.out.println(st3.getMemberInfo());
		System.out.println(st3);
	}
}