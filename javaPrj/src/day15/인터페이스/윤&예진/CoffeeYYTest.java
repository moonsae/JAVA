package day15.정렬연습3;

public class CoffeeYYTest {

	public static void main(String[] args) {

		Coffee[] arr = new Coffee[3];
		
		arr[0]=new Coffee("아메리카노",150,450);
		arr[1]=new Coffee("바닐라라떼",310,520);
		arr[2]=new Coffee("연유라떼",420,600);
		
		CoffeeArraysYY.sort(arr, new C());
		
		for(Coffee coffee:arr)
			System.out.println(coffee);
		
	}

}
