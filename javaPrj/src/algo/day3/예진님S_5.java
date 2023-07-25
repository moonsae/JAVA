package algo.day3;

public class 예진님S_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=2;
		int i=0;
		
		while(i<7) {
			sum+=n;
			n*=3;
			i++;
		}

		System.out.println(sum);
	}

}
