package algo.day9;

import java.util.Arrays;

public class 배열복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {3,5,9};
		
		int[] newArr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}

}
