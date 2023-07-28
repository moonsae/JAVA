package algo.day9;

public class 함수리턴 {

	public static void main(String[] args) {

		int[] arr = new int[] {9,8,7};
		printArry(arr); //호출
		
	}
	public static void printArry(int[] a) {
		for(int number:a) {
			System.out.println(number);
		}
		/*
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		*/
		
	}

}
