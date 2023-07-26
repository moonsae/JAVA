package algo.day6;

public class Qz1_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatures = { 27,27,28, 29,30 , 33,32,33,32,31,31,33,33,31} ;

		System.out.println("=====문제1=====");
		System.out.println("배열의 모든 기온을 출력하시오");
		for(int i=0; i<temperatures.length; i++) {
			System.out.print(temperatures[i]+"\t");
		}
		System.out.println();
		System.out.println("=====문제2=====");
		System.out.println("배열의 모든 기온을 거꾸로 출력하시오");
		for(int i=temperatures.length-1; i>0; i--) {
			System.out.print(temperatures[i]+"\t");
		}
		System.out.println();
		System.out.println("=====문제3=====");
		System.out.println("평균기온을 출력하시오");
		int sum = 0;
		int avg = 0;
		for(int i=0; i<temperatures.length; i++) {
			sum+=temperatures[i];
		}
		avg = sum/temperatures.length;
		System.out.println("평균 기온: "+avg);
		System.out.println("=====문제4=====");
		System.out.println("평균기온보다 높은 일수를 구하시오");
		for(int i=0; i<temperatures.length; i++) {
			if(temperatures[i]>avg) {
				System.out.print(temperatures[i]+"\t");
			}
		}
		
	}

}
