package Qz9;

import java.util.Scanner;

public class 도전과제3차원배열 {

	static String[][][] year = new String[12][30][5];
	static int[][] index = new int[12][30];
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		//일정을 관리하는 프로그램 작성 (일정 10개)
		//
		int menu;
		loop: while(true) {
			System.out.println("1년 일정 관리 프로그램");
			System.out.print("메뉴 선택: 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료  ");
			String menu_ = sc.nextLine();
			menu=Integer.parseInt(menu_);	
			switch(menu) {
			case 1:
				insert();
				break;
			case 2:
				print_schedule();
				
				break;
			case 3:
				update_schedule();
				
				break;
			case 4:
				delete_schedule();
				
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
	public static void delete_schedule() {
		System.out.printf("월을 입력하세요. ");
		String month_ = sc.nextLine();
		int month = Integer.parseInt(month_);
		System.out.printf("날짜를 입력하세요. ");
		String num3_ = sc.nextLine();
		int num3 = Integer.parseInt(num3_);
		int index_num3 = index[month-1][num3-1];
		for(int i=0; i<index_num3; i++) {
			System.out.println(month+" 월 "+num3+"일 "+(i+1)+". " +year[month-1][num3-1][i]);
		}
		System.out.println("삭제하고 싶은 일정을 선택하세요 ");
		String deleteIndex_= sc.nextLine();
		int deleteIndex = Integer.parseInt(deleteIndex_);
		for(int i=deleteIndex-1;i<index_num3 ; i++) {
			if(i==index_num3 -1) {
				year[month-1][num3-1][i]="";
				continue;
			}
			year[month-1][num3-1][i]=year[month-1][num3-1][i+1];
		}
		index[month-1][num3-1]=index_num3-1;
	}
	public static void update_schedule() {
		System.out.println("변경");
		System.out.printf("월을 입력하세요. ");
		String month_ = sc.nextLine();
		int month = Integer.parseInt(month_);
		System.out.printf("날짜를 입력하세요. ");
		String num2_ = sc.nextLine();
		int num2 = Integer.parseInt(num2_);
		System.out.println("변경할 번호를 입력하세요");
		String updateIndex_= sc.nextLine();
		int updateIndex = Integer.parseInt(updateIndex_);
		System.out.println("변경할 내용을 입력하세요");
		String updateDay = sc.nextLine();
		year[month-1][num2-1][updateIndex-1] = updateDay;
	}
	public static void print_schedule() {
		System.out.println("일정을 조회합니다. ");
		System.out.printf("월을 입력하세요. ");
		String month_ = sc.nextLine();
		int month = Integer.parseInt(month_);
		System.out.printf("날짜를 입력하세요. ");
		String num1_ = sc.nextLine();
		int num1= Integer.parseInt(num1_);
		int index_num2 = index[month-1][num1-1];
		for(int i=0; i<index_num2; i++) {
			System.out.println(month+" 월 "+num1+"일 "+(i+1)+". " +year[month-1][num1-1][i]);
		}
	}
	public static void insert() {
		System.out.printf("월을 입력하세요. ");
		String month_ = sc.nextLine();
		int month = Integer.parseInt(month_);
		System.out.printf("날짜를 입력하세요. ");
		String num_ = sc.nextLine();
		int num = Integer.parseInt(num_);
		System.out.print("일정을 입력하세요. ");
		String day = sc.nextLine();
		int index_num1 = index[month-1][num-1];
		year[month-1][num-1][index_num1 ] = day;
		index[month-1][num-1]=index_num1+1;
	}
}