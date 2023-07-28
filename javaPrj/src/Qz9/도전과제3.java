package Qz9;

public class 도전과제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s1= new Score();
		s1.name="홍길동";
		s1.kor=90;
		s1.eng=80;
		int avg = (s1.kor + s1.eng)/2; 
		System.out.println("학생이름 : "+s1.name);
		System.out.println("국어 : "+s1.kor);
		System.out.println("영어 : "+s1.eng);
		System.out.println("평균 : "+avg);

	}

}

class Score{
	String name;
	int kor;
	int eng;

}
