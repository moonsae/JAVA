package algo.day8;
import java.util.Scanner;
public class DayMng {

	static String[][] july = new String[31][5];
	static int index=0;
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		//일정을 관리하는 프로그램 작성 (일정 10개)
		//
		int menu;
		loop: while(true) {
			System.out.println("7월 일정 관리 프로그램");
			System.out.print("메뉴 선택: 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료  ");
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);	
			switch(menu) {
			case 1:
				insertDay();
				break;
			case 2:
				selectDays();
				
				break;
			case 3:
				updateDay();
				
				break;
			case 4:
				deleteDay();
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 입력");
			}
		}
		System.out.println("bye");

	}
	public static void deleteDay() {
		if(index<1) {
			System.out.println("삭제할 일정 없음");
		}
		else {
			System.out.printf("날짜를 입력하세요. ");
			String num_ = sc.nextLine();
			int num = Integer.parseInt(num_);
			for(int i=0; i<index; i++) {
				System.out.println("7월 "+num+"일 "+(i+1)+". " +july[num][i]);
			}
			System.out.println("삭제하고 싶은 일정을 선택하세요 ");
			String deleteIndex_= sc.nextLine();
			int deleteIndex = Integer.parseInt(deleteIndex_);
			for(int i=deleteIndex-1;i<index; i++) {
				if(i==index-1) {
					july[num][i]="";
					continue;
				}
				july[num][i]=july[num][i+1];
			}
			index--;
		}
	}
	public static void updateDay() {
		System.out.println("변경");
		System.out.printf("날짜를 입력하세요. ");
		String num_ = sc.nextLine();
		int num = Integer.parseInt(num_);
		System.out.println("변경할 번호를 입력하세요");
		String updateIndex_= sc.nextLine();
		int updateIndex = Integer.parseInt(updateIndex_);
		System.out.println("변경할 내용을 입력하세요");
		String updateDay = sc.nextLine();
		july[num][updateIndex-1] = updateDay;
	}
	public static void insertDay() {
		System.out.printf("날짜를 입력하세요. ");
		String num_ = sc.nextLine();
		int num = Integer.parseInt(num_);
		System.out.print("일정을 입력하세요. ");
		String day = sc.nextLine();
		july[num][index] = day;
		index++;
	}
	public static void selectDays() {
		System.out.println("일정을 조회합니다. ");
		System.out.printf("날짜를 입력하세요. ");
		String num_ = sc.nextLine();
		int num = Integer.parseInt(num_);
		for(int i=0; i<index; i++) {
			System.out.println("7월 "+num+"일 "+(i+1)+". " +july[num][i]);
		}
	}

	

}
