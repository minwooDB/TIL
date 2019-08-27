package Day6;

class Book {
	String title;
	String author;
	int price;
	Book(){
	this("자바의 정석","정동성",9900);
	/*title ()= "자바의 정석";
	author ()= "정동성";
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
		book[1] = new Book("수학의 정석","이대호",22000);
		book[2] = new Book("영어의 정석","김영호",23000);
		book[3] = new Book("국어의 정석","김국호",13000);
		book[4] = new Book("사회의 정석","김사호",15000);
	}
}