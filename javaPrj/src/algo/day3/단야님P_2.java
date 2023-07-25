package algo.day3;

public class 단야님P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; //누적합
		int jsum = 0;
		int i =1; // 반복을 제어할 변수
		
		int j=i-1; // j=0;
		
		final int MAX = 5;
		
		while(i<=MAX) {
			j = i-1;
			jsum = jsum+j;
			sum=sum+(jsum+i);
			i++;
		}
		System.out.println(sum);
			

	}

}
