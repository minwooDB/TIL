package Day6;
/*Member4 ��ü (�ν��Ͻ�)�� 3�� �����ϰ� 
������ ��� ������ ������ ������ �Ŀ� 
���� ������ �����Ͽ� ���� �������� ����ϴ� Member4TeobjA Ŭ������ �����Ѵ�.

	ȸ��1 : �̸�(����,�н�����,����)
	ȸ��2 : �̸�(����,�н�����,����)
	ȸ��3 : �̸�(����,�н�����,����)
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
		return "ȸ��"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class MemberTest4 {
	public static void main(String[] args) {
		Member4 objA[] = new Member4[3];
		objA[0] = new Member4();
		objA[0].name = "�̹ο�";
		objA[0].account = "alsdn11456";
		objA[0].passwd = "�ο�";
		objA[0].num = 1;
		objA[0].setBirthyear(920812);
		System.out.println(objA[0].getMember4Info());
		System.out.println(objA[0]);
		objA[1] = new Member4();
		objA[1].name = "������";
		objA[1].account = "����11456";
		objA[1].passwd = "����";
		objA[1].num = 2;
		objA[1].setBirthyear(-920812);
		System.out.println(objA[1].getMember4Info());
		System.out.println(objA[1]);
		objA[2] = new Member4();
		objA[2].name = "��ȣ";
		objA[2].account = "��ȣ1156";
		objA[2].passwd = "��ȣ";
		objA[2].num = 3;
		objA[2].setBirthyear(920812);
		System.out.println(objA[2].getMember4Info());
		System.out.println(objA[2]);
	}
}