package algo.day3;
import java.util.Scanner;
public class 민지님P_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int positive=0;
		int negative=0;
		int odd=0;
		int even=0;
		int i=0;
		int n; //입력변수
		
		final int MAX = 5;
		
		Scanner sc = new Scanner(System.in);
		while(i<MAX) {
			n=sc.nextInt();
			if(n>0) {
				positive++;
				if(n%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
			else {
				negative++;
			}
			i++;
		}
		System.out.println("양수: "+positive);
		System.out.println("음수: "+negative);
		System.out.println("짝수: "+even);
		System.out.println("홀수: "+odd);

	}

}
