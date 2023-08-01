package day11.생성자;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop2 sh1 = new shop2("홈앤쇼핑","https://www.hnsmall.com/index.do");
		
		order2 james = new order2(201803120001L,"abc123", "2018년3월12일", "홍길순", "😛D0345-12", "서울시 영등포구 여의도동 20번지");

	    String result1 = sh1.toString();
	    String result2 = james.toString();
	    
	    System.out.println(result1);
	    System.out.println(result2);		
	}

}
class shop2{
	private String name;
	private String web;
	
	public shop2(String name, String web) {
		this.name = name;
		this.web = web;
	}
	public String toString() {
		return name+" "+web;
	}
}
class order2{
	private long order_num;
	private String id;
	private String date;
	private String name;
	private String product_num;
	private String addr;
	
	public order2(long order_num, String id, String date, String name, String product_num, String addr) {
		this.order_num = order_num;
		this.id = id;
		this.date = date;
		this.name = name;
		this.product_num =product_num;
		this.addr = addr;
	}
	public String toString() {
	
		return "주문번호: "+order_num+"\n주문자아이디: "+id+
				"\n주문날짜: "+date+"\n주문자이름: "+name+"\n주문상품번호: "+product_num+
				"\n배송주소: "+addr;
	}
	
}