package algo.day9;

public class CustomerTest {

	public static void main(String[] args) {

		int a;
		// 자료형 변수;
		// 배열, 객체는 메모리에 공간을 확보하는 행위를 할 때는 new로
		// 힙 메모리 사용 
		Customer c =new Customer();
		c.name = "홍길동";
		c.id = "angel1";
		c.age=25;
		
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.age);
		
		
	}

}
