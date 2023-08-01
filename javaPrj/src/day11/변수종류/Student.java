package day11.변수종류;

public class Student {
	String name;
	int kor;
	int eng;
	String teacher;
	double avg;
	public Student() {}
	public Student(String name, int kor, int eng, String teacher) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.teacher = teacher;
	}
	
	public String toString() {
		return name + " "+kor+" "+eng+" "+teacher;
	}
	
	
		
	
}
