package Day6;


class product{
 private String name;
 private int balance;
 private int price;
 
 Product() {
 this("��ũ����",5,10000);
 }
 
 Product(String name, int balance, int price){
 this.name = name;
 this.balance= balance;
 this.price= price;
 }
 
 String getbookinfo() {
		return "��ǰ��:"+name+"���:"+balance+"����"+price;
}
public class ProductTest{
public void main(String[] args) {
Product prodcut[]= new product[5];
		product[0]=new product();
		product[1]=new product("���ϸ�����",3,15000);
		product[2]=new product("����������",5,20000);
		product[3]=new product("���������",6,30000);
		product[4]=new product("��������",1,70000);
			
	
}
}