package Qz9;

import java.util.Scanner;

public class 실습과제2 {

	static String[] movie = new String[5];
	static Scanner sc = new Scanner(System.in);
	static int index =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("영화 관리 프로그램");
		while(true) {
			System.out.println("============");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("0. 종료");
			System.out.println("============");
			System.out.printf("메뉴를 선택하세요. => ");
			String menu_ = sc.nextLine();
			int menu = Integer.parseInt(menu_);
			switch(menu) {
			case 1:
				insertMovie();
				break;
			case 2:
				printMovie();
				break;
			case 0:
				return ;
			default:
				System.out.println("잘못된 입력입니다.");	
			}	
		}
	}
    public static void insertMovie() {
    	System.out.println("등록");
    	System.out.print("영화 제목을 입력하세요 ");
    	String title = sc.nextLine();
    	movie[index] = title;
    	index++;
    	System.out.println();
    }
    public static void printMovie() {
    	System.out.println("저장된 영화 제목이 출력됩니다. ");
    	for(int i=0; i<index; i++) {
    		System.out.println(movie[i]);
    	}
    }

}
