package algo.day3;

public class 별모양 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====<기본별>=====");
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");
		
		System.out.println("=====<1번>=====");
		for(int j=0; j<5; j++) {
			for(int i=0; i<j+1; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");
		
		System.out.println("=====<2번>=====");
		for(int j=0; j<5; j++) {
			for(int i=j; i<5; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");
		
		System.out.println("=====<3번>=====");
		for(int j=0; j<5; j++) {
			for(int i=0; i<j; i++) {
				System.out.printf(" ");
			}
			for(int i=j; i<5; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");
		
		System.out.println("=====<4번>=====");
		for(int j=0; j<5; j++) {
			for(int i=0; i<4-j; i++) {
				System.out.printf(" ");
			}
			for(int i=4-j; i<5; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");
		
		System.out.println("=====<5번>=====");
		for(int j=0; j<4; j++) {
			for(int i=0; i<3-j; i++) {
				System.out.printf(" ");
			}
			for(int i=3-j; i<=3+j; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");
		
		System.out.println("=====<6번>=====");
		for(int j=0; j<4; j++) {
			for(int i=0; i<3-j; i++) {
				System.out.printf(" ");
			}
			for(int i=3-j; i<=3+j; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for(int j=0; j<3; j++) {
			for(int i=0; i<=j; i++) {
				System.out.printf(" ");
			}
			for(int i=1+j; i<=5-j; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.println("================");

	}

}
