package algo.day2;

public class 정훈님S_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int n = 2;
		final int MAX = 10;
		System.out.println(a +" "+b);
		while(n<=MAX) {
			a = a+b;
			b = a+b;
			n = n+2;
			System.out.println(a + " "+b);
		}

	}

}
