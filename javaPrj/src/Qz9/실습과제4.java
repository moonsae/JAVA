package Qz9;

import java.util.Scanner;

public class 실습과제4 {
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
			System.out.println("3. 변경");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.println("============");
			System.out.printf("메뉴를 선택하세요. => ");
			String menu_ = sc.nextLine();
			int menu = Integer.parseInt(menu_);
			switch(menu) {
			case 1:
				addMovie();
				break;
			case 2:
				printMovie();
				break;
			case 3:
				updateMovie();
				break;
			case 4:
				deleteMovie();
				break;
			case 0:
				return ;
			default:
				System.out.println("잘못된 입력입니다.");	
			}	
		}
	}
    public static void addMovie() {
    	System.out.print("영화 제목을 입력하세요.");
    	String title = sc.nextLine();
    	movie[index] = title;
    	index++;
    	System.out.println();
    }
    public static void printMovie() {
    	System.out.println("저장된 영화 제목이 출력됩니다.");
    	for(int i=0; i<index; i++) {
    		System.out.println((i+1)+". "+movie[i]);
    	}
    }
    public static void updateMovie() {
    	printMovie();
    	System.out.println("변경할 번호를 입력하세요.");
        String num_ = sc.nextLine();
        int num = Integer.parseInt(num_);
        System.out.println("변경할 제목을 입력하세요. ");
        String name = sc.nextLine();
        movie[num-1] = name;
    }
    public static void deleteMovie() {
    	printMovie();
    	System.out.println("삭제할 영화의 번호를 입력하세요. ");
    	String num_ = sc.nextLine();
        int num = Integer.parseInt(num_);
    	for(int i=num-1; i<index; i++) {
    		if(i==index-1) {
    			movie[i]="";
    		}
    		else{movie[i]=movie[i+1];}
    	}
    	index--;
    	
    }
}
