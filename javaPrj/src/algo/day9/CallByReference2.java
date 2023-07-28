package algo.day9;

public class CallByReference2 {

	public static void main(String[] args) {
		
		
		int[] kors = new int[3];
		array(kors);
	}

	public static void array(int[] arr) {
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	

}
