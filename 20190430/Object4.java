package Day6;

class Book {
	String title;
	String author;
	int price;
	Book(){
	this("�ڹ��� ����","������",9900);
	/*title ()= "�ڹ��� ����";
	author ()= "������";
	price ()= 9900;*/
	}
	Book(String title,String author,int price) {
	this.title = title;
	this.author= author;
	this.price= price;
	}	
	String getMemberInfo() {
		return "title:"+title+"author:"+author+"price:"+price;
	}
	}
public class Object4 {
	public static void main(String[] args) {
		Book book[] = new Book[5];
		book[0] = new Book();
		book[1] = new Book("������ ����","�̴�ȣ",22000);
		book[2] = new Book("������ ����","�迵ȣ",23000);
		book[3] = new Book("������ ����","�豹ȣ",13000);
		book[4] = new Book("��ȸ�� ����","���ȣ",15000);
	}
}