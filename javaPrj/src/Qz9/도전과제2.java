package Qz9;

public class 도전과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		order o1 = new order();
		o1.order_num =201803120001L;
		o1.id="abc123";
		o1.date="2018년3월12일";
		o1.name="홍길순";
		o1.product_num="😛D0345-12";
		o1.addr="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호: "+o1.order_num);
		System.out.println("주문자아이디: "+o1.id);
		System.out.println("주문날짜: "+o1.date);
		System.out.println("주문자이름: "+o1.name);
		System.out.println("주문상품번호: "+o1.product_num);
		System.out.println("배송주소: "+o1.addr);
		

	}

}
class order{
    long order_num;
    String id;
    String date;
    String name;
    String product_num;
    String addr;
}
