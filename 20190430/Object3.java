package Day6;
/*Member2 ��ü (�ν��Ͻ�)�� 3�� �����ϰ� 
������ ��� ������ ������ ������ �Ŀ� 
���� ������ �����Ͽ� ���� �������� ����ϴ� Member2TeobjA Ŭ������ �����Ѵ�.

	ȸ��1 : �̸�(����,�н�����,����)
	ȸ��2 : �̸�(����,�н�����,����)
	ȸ��3 : �̸�(����,�н�����,����)
*/
class Member2{
	String name;
	String account;
	String passwd;
	int	birthyear;
	int num;

	String getMember2Info() {
		return "ȸ��"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class Object3 {
	public static void main(String[] args) {
		Member2 objA[] = new Member2[3];
		objA[0] = new Member2();
		objA[0].name = "�̹ο�";
		objA[0].account = "alsdn11456";
		objA[0].passwd = "�ο�";
		objA[0].num = 1;
		objA[0].birthyear = 920812;
		System.out.println(objA[0].getMember2Info());
		System.out.println(objA[0]);
		objA[1] = new Member2();
		objA[1].name = "������";
		objA[1].account = "����11456";
		objA[1].passwd = "����";
		objA[1].num = 2;
		objA[1].birthyear = 990812;
		System.out.println(objA[1].getMember2Info());
		System.out.println(objA[1]);
		objA[2] = new Member2();
		objA[2].name = "��ȣ";
		objA[2].account = "��ȣ1156";
		objA[2].passwd = "��ȣ";
		objA[2].num = 3;
		objA[2].birthyear = 10812;
		System.out.println(objA[2].getMember2Info());
		System.out.println(objA[2]);
	}
}