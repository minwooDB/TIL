package Day6;
/*Member4 객체 (인스턴스)를 3개 생성하고 
각각의 멤버 변수에 정보를 저장한 후에 
각각 정보를 추출하여 다음 형식으로 출력하는 Member4TeobjA 클래스를 구현한다.

	회원1 : 이름(계정,패스워드,생년)
	회원2 : 이름(계정,패스워드,생년)
	회원3 : 이름(계정,패스워드,생년)
*/
class Member4{
	String name;
	String account;
	String passwd;
	private int	birthyear;
	int num;
	
	void setBirthyear(int brithyear) {
		if(birthyear<0)
			return;
		this.birthyear = birthyear;
	}
	int getBirthyear() {
		return birthyear;
	}
	
	String getMember4Info() {
		return "회원"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class MemberTest4 {
	public static void main(String[] args) {
		Member4 objA[] = new Member4[3];
		objA[0] = new Member4();
		objA[0].name = "이민우";
		objA[0].account = "alsdn11456";
		objA[0].passwd = "민우";
		objA[0].num = 1;
		objA[0].setBirthyear(920812);
		System.out.println(objA[0].getMember4Info());
		System.out.println(objA[0]);
		objA[1] = new Member4();
		objA[1].name = "이진우";
		objA[1].account = "진우11456";
		objA[1].passwd = "진우";
		objA[1].num = 2;
		objA[1].setBirthyear(-920812);
		System.out.println(objA[1].getMember4Info());
		System.out.println(objA[1]);
		objA[2] = new Member4();
		objA[2].name = "건호";
		objA[2].account = "건호1156";
		objA[2].passwd = "건호";
		objA[2].num = 3;
		objA[2].setBirthyear(920812);
		System.out.println(objA[2].getMember4Info());
		System.out.println(objA[2]);
	}
}