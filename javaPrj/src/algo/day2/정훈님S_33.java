package algo.day2;

public class 정훈님S_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b; 
		a = b= 1;
		int n = 2;
		final int MAX = 10;
		
		System.out.println(a +" "+ b);
		
		while(n<=MAX) {
			b = a+b;
			a = b-a;
			n = n+1;
			System.out.println(b);
		}

	}

}
