package day10.classType;

public class Movie_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie2 mArr[] = new movie2[3];
		mArr[0] = new movie2();
		mArr[1] = new movie2();
		mArr[2] = new movie2();
		mArr[0].input("바비", 114, "2023.07.19");
		mArr[1].input("엘리멘탈", 109, "2023.06.14");
		mArr[2].input("밀수", 129, "2023.07.26");
		
		for(int i=0; i<mArr.length; i++) {
			mArr[i].printData();
		}
		

	}

}

class movie2{
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
