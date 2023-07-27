package algo.day8;

public class FuncEx3 {

	public static void main(String[] args) {
		
		
		int n=5;
		int result = getSum2(n);
		System.out.println(result);

	}

	public static int getSum2(int n) {
		int sum=0;
		for (int i=1; i<=n; i++) {
			sum+=i;
		}
		return sum;
	}

	  

}
