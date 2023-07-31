package day10.classType;

public class Movie_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie1 m1 = new movie1();
		m1.input("바비", 114, "2023.07.19");
		movie1 m2 = new movie1();
		m2.input("엘리멘탈", 109, "2023.06.14");
		movie1 m3 = new movie1();
		m3.input("밀수", 129, "2023.07.26");
		m1.printData();
		m2.printData();
		m3.printData();

	}

}

class movie1{
	private String title;
	private int time;
	private String date;
	
	public void input(String title, int time, String date) {
		this.title = title;
		this.time = time;
		this.date = date;
	}
	public void printData() {
		System.out.println(title+" | "+time+"분 | "+date);
		
	}
}
