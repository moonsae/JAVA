package day12.Qz;
import java.util.Scanner;
public class DayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Day[] days = new Day[5];
		
		//일정등록
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("일정을 입력하세요");
			String s1 = sc.nextLine();
			days[i]= new Day(i+1,s1);
		}
		//일정조회
		for(int i=0; i<5; i++){
			System.out.println(days[i].toString());
		}
	}

}
