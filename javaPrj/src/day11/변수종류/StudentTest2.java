package day11.변수종류;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조형변수로 다룬다
		// 참조형변수(리모콘변수)
		// 1. new를 통해서 공간을 확보한다
		// 2. 생성자에 의해서 공간의 값이 초기화된다
		// 3. 생성된 객체의 정보를 s1 참조형변수가 저장한다.
		// 4. 참조형변수를 통해서 객체의 정보를 저장하거나 이용한다.
		// 5. 객체지향은 매서드를 통해서 값을 사용하는 방법을 이용한다.
		
		Student2 s1 = new Student2("이정훈",100,99,"우주연");
		Student2 s2 = new Student2("이윤정",99,100,"우주연");
		Student2 s3 = new Student2("이윤",99,100,"우주연");
		Student2 s4 = new Student2("조은경",99,100,"우주연");
		
		// new 대상 => 
		
		System.out.println(s1.toString());
	    System.out.println(s2); // =>s2.toString() 생략가능한 매서드
	}

}
