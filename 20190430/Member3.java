package Day6;
/*Member3 ��ü (�ν��Ͻ�)�� 3�� �����ϰ� 
������ ��� ������ ������ ������ �Ŀ� 
���� ������ �����Ͽ� ���� �������� ����ϴ� Member3TeobjA Ŭ������ �����Ѵ�.

	ȸ��1 : �̸�(����,�н�����,����)
	ȸ��2 : �̸�(����,�н�����,����)
	ȸ��3 : �̸�(����,�н�����,����)
*/
class Member3{
	String name;
	String account;
	String passwd;
	int	birthyear;
	int num;
	Member3(){
		System.out.println("��ü ����");
	   
	}
	Member3(String n, String a, String p, int by){
		name = n;
		account = a;
		passwd = p;
		birthyear = by;
	}
	String getMember3Info() {
		return "ȸ��"+num+":"+name+"( " + account +","+passwd+","+birthyear+")";
	}
}

public class Member3 {
		Member3 objA[] = new Member3 [3];
		objA[0] = new Member3("�̹ο�"+"010","")
		objA[1].name = "�̹ο�";
		objA[2].account = "alsdn11456";
		System.out.println(objA[0].getMember3Info());
		System.out.println(objA[0]);
		objA[1] = new Member3();
		objA[1].name = "������";
		objA[1].account = "����11456";
		objA[1].passwd = "����";
		objA[1].num = 2;
		objA[1].birthyear = 990812;
		System.out.println(objA[1].getMember3Info());
		System.out.println(objA[1]);
		objA[2] = new Member3();
		objA[2].name = "��ȣ";
		objA[2].account = "��ȣ1156";
		objA[2].passwd = "��ȣ";
		objA[2].num = 3;
		objA[2].birthyear = 10812;
		System.out.println(objA[2].getMember3Info());
		System.out.println(objA[2]);
	}
}