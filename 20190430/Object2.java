package Day6;
/*Member ��ü (�ν��Ͻ�)�� 3�� �����ϰ� 
������ ��� ������ ������ ������ �Ŀ� 
���� ������ �����Ͽ� ���� �������� ����ϴ� MemberTest Ŭ������ �����Ѵ�.

	ȸ��1 : �̸�(����,�н�����,����)
	ȸ��2 : �̸�(����,�н�����,����)
	ȸ��3 : �̸�(����,�н�����,����)
*/
class Member{
	String name;
	String account;
	String passwd;
	int	birthyear;
	int num;

	String getMemberInfo() {
		return "ȸ��"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class Object2 {
	public static void main(String[] args) {
		Member st1 = new Member();
		st1.name = "�̹ο�";
		st1.account = "alsdn11456";
		st1.passwd = "�ο�";
		st1.num = 1;
		st1.birthyear = 920812;
		System.out.println(st1.getMemberInfo());
		System.out.println(st1);
		Member st2 = new Member();
		st2.name = "������";
		st2.account = "����11456";
		st2.passwd = "����";
		st2.num = 2;
		st2.birthyear = 990812;
		System.out.println(st2.getMemberInfo());
		System.out.println(st2);
		Member st3 = new Member();
		st3.name = "��ȣ";
		st3.account = "��ȣ1156";
		st3.passwd = "��ȣ";
		st3.num = 3;
		st3.birthyear = 10812;
		System.out.println(st3.getMemberInfo());
		System.out.println(st3);
	}
}