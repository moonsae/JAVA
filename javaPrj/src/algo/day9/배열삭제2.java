package algo.day9;

public class 배열삭제2 {

	public static void main(String[] args) {

		int[] arr = {5,2,8,9};
		// 삭제할 index : 2 (8을 삭제)
		int index=2;
		int[] newArry = new int[arr.length-1];
		
		// 배열삭제
		for(int i=0; i<index; i++) {
			newArry[i] = arr[i];
		}
		for(int i=index; i< newArry.length; i++) {
			newArry[i] = arr[i+1];
			
		}
	}

}
