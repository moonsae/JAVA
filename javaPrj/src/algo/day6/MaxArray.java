package algo.day6;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= new int[]{0,3,7,11,9};
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
