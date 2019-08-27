package Day6;


class product{
 private String name;
 private int balance;
 private int price;
 
 Product() {
 this("듀크인형",5,10000);
 }
 
 Product(String name, int balance, int price){
 this.name = name;
 this.balance= balance;
 this.price= price;
 }
 
 String getbookinfo() {
		return "상품명:"+name+"재고량:"+balance+"가격"+price;
}
public class ProductTest{
public void main(String[] args) {
Product prodcut[]= new product[5];
		product[0]=new product();
		product[1]=new product("포켓몬인형",3,15000);
		product[2]=new product("디지몬인형",5,20000);
		product[3]=new product("디즈니인형",6,30000);
		product[4]=new product("마블인형",1,70000);
			
	
}
}