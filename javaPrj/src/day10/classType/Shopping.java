package day10.classType;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop sh1 = new shop();
		sh1.input_shop("홈앤쇼핑","https://www.hnsmall.com/index.do");
		
		order james = new order();
		james.input_order(201803120001L,"abc123", "2018년3월12일", "홍길순", "😛D0345-12", "서울시 영등포구 여의도동 20번지");

		sh1.print_shop();
		james.print_order();
	}

}
class shop{
	private String name;
	private String web;
	
	public void input_shop(String name,String web) {
		this.name = name;
		this.web = web;
	}
	public void print_shop() {
		System.out.println("===쇼핑몰 정보===");
		System.out.println("쇼핑몰 명: "+ name);
		System.out.println("쇼핑몰 주소: "+ web);
	}
}
class order{
	private long order_num;
	private String id;
	private String date;
	private String name;
	private String product_num;
	private String addr;
	
	public void input_order(long order_num, String id, String date, String name, String product_num, String addr) {
		this.order_num = order_num;
		this.id = id;
		this.date = date;
		this.name = name;
		this.product_num =product_num;
		this.addr = addr;
	}
	public void print_order() {
		System.out.println("===주문자정보===");
		System.out.println("주문번호: "+order_num);
		System.out.println("주문자아이디: "+id);
		System.out.println("주문날짜: "+date);
		System.out.println("주문자이름: "+name);
		System.out.println("주문상품번호: "+product_num);
		System.out.println("배송주소: "+addr);
	}
	
}