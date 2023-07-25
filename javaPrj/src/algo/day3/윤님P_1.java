package algo.day3;

public class 윤님P_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1+3+5+7+9+11....99 합을 구하시오
		
		int sum=0;
		int n=1;
		final int MAX = 99;
		
		while(n<=MAX) {
			sum+=n;
			n+=2;
		}
		System.out.println(sum);

	}

}
