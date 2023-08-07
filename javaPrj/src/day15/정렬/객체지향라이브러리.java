package day15.정렬;

import java.util.Arrays;

public class 객체지향라이브러리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score[] arr = new Score[3]; // 배열은 모두 null로 초기화됨
				
		arr[0] = new Score("홍길동",100,90);
		arr[1] = new Score("김길동",80,75);
		arr[2] = new Score("다길동",75,85);
		
		Arrays.sort(arr);
		
		

	}

}
