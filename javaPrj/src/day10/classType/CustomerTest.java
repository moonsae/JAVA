package day10.classType;

public class CustomerTest {

	public static void main(String[] args) {

		// 자료형이 있으면 자료형이 맞는 변수를 만들 수 있어야 한다.
		
	    int a;
	    a=10;
	    
	    // Customer형 변수를 만들어 보장
	    
	    Customer customer; //customer형 변수가 만들어지지 않았다.
	    customer = new Customer(); // new를 통해서 Customer형 변수가 만들어진다.
	                  // customer변수 참조형 변수
	                  // customer형 변수가 있는 위치, 레퍼런스를 저장하는 참조형 변수
	    
	    customer.id = "test01";
	    customer.pw = "1234";
	    customer.name = "홍길동";
	    customer.address="서울시 마포구";
	
	    System.out.println(customer.id);
	    System.out.println(customer.pw);
	    System.out.println(customer.name);
	    System.out.println(customer.address);
	    
	    
	}

}
