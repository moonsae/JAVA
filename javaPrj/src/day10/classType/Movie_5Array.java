package day10.classType;
import java.util.Scanner;
public class Movie_5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie3 m5Arr[] = new movie3[5];
		for(int i=0; i<5; i++) {
			m5Arr[i]= new movie3();
		}
		Scanner sc = new Scanner(System.in);
		String title;
		int time;
		String date;
		int index = 0;
	
		while(true) {
			System.out.println("====영화 관리====");
			System.out.println("1. 영화 등록");
			System.out.println("2. 영화 조회");
			System.out.println("3. 영화 변경");
			System.out.println("0. 종료");
			System.out.println("=> 메뉴 선택");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("1. 영화 등록");
				if(index==5) {
					System.out.println("영화 등록 불가");
				}
				else {
					System.out.print("영화 제목을 입력하세요");
					title = sc.next();
					System.out.print("영화 시간을 입력하세요");
					time= sc.nextInt();
					System.out.print("개봉일을 입력하세요");
					date= sc.next();
					m5Arr[index].input(title, time, date);
					index++;
					System.out.println(title+" 영화 정보가 정상적으로 등록되었습니다. ");
				}
				break;
			case 2:
				System.out.println("2. 영화 조회");
				for(int i=0; i<index; i++) {
					System.out.print(i+1 +"번. ");
					m5Arr[i].printData();
				}
				break;
			case 3:
				System.out.println("3. 영화 변경");
			    System.out.println("영화 목록");
			    System.out.println("==================");
			    for(int i=0; i<index; i++) {
					System.out.print(i+1 +"번. ");
					m5Arr[i].printData();
				}
			    System.out.println("변경할 영화의 번호를 입력하세요");
			    int choice = sc.nextInt();
			    System.out.print("영화 제목을 입력하세요");
				title = sc.next();
				System.out.print("영화 시간을 입력하세요");
				time= sc.nextInt();
				System.out.print("개봉일을 입력하세요");
				date= sc.next();
			    m5Arr[choice-1].input(title, time, date);
			    System.out.println(title+" 영화 정보가 정상적으로 변경되었습니다. ");
			    break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력입니다.");
		   }
			
			
		}
		
		

	}

}

class movie3{
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
