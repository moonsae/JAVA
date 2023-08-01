package day11.변수종류;

public class Student2 {
	String name;
	int kor;
	int eng;
	double avg;
	String teacher;
	
	// 클래스변수 : 클래스 안에서 하나만 만들어짐
	// 클래스 안에서 공통적으로 사용하는 값을 저장하기 위한 변수
	// 클래스변수는 프로그램 시작하면 만들어짐 프로그램 종료까지
	
	public Student2() {}
	public Student2(String name, int kor, int eng, String teacher) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2.0;
		this.teacher = teacher;
	}
	
	public String toString() {
		return name + " "+kor+" "+eng+" "+teacher;
	}
	
	
		
	
}
