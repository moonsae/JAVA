package algo.day3;

public class 구구단출력2 {

	public static void main(String[] args) {
		//2단 ~4단
		//2단
		for(int i=1; i<=9; i++) {
		    System.out.println("2 * "+i+" = "+2*i);
		}
		//3단
		for(int i=1; i<=9; i++) {
		    System.out.println("3 * "+i+" = "+3*i);
		}
		//4단
		for(int i=1; i<=9; i++) {
		    System.out.println("4 * "+i+" = "+4*i);
		}
		//5단
		for(int i=1; i<=9; i++) {
		    System.out.println("5 * "+i+" = "+5*i);
		}
		//6단
		for(int i=1; i<=9; i++) {
		    System.out.println("6 * "+i+" = "+6*i);
		}
		//7단
		for(int i=1; i<=9; i++) {
		    System.out.println("7 * "+i+" = "+7*i);
		}
		//8단
		for(int i=1; i<=9; i++) {
		    System.out.println("8 * "+i+" = "+8*i);
		}
		//9단
		for(int i=1; i<=9; i++) {
		    System.out.println("9 * "+i+" = "+9*i);
		}
		
		for(int j=2; j<=9; j++) {
			for(int i=1; i<=9; i++) {
				System.out.println(j*i);
			}
		}

	}

}
