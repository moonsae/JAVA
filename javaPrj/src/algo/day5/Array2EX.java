package algo.day5;

public class Array2EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//내가 좋아하는 과일 5
		//내가 좋아하는 음료 5
		
		String[] fruits = {"딸기","망고","포도","오렌지","파인애플"};
		String[] beverage = {"레몬에이드","복숭아아이스티","딸기주스","망고스무디","타로버블티"};
		
		//2차원 배열
		
		//2차원 배열 선언 [행][열]
		
		//String[][] favorites = new String[2][5];
		
		String[][] favorites = {{"딸기","망고","포도","오렌지","파인애플"},
				                {"레몬에이드","복숭아아이스티","딸기주스","망고스무디","타로버블티"}};
		
		System.out.println(favorites[0][0]);
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println(favorites[0][4]);

		System.out.println(favorites[1][0]);
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		System.out.println(favorites[1][4]);
		
		
		int arr[][] = {{1,2,3,4,5},
					   {11,12,13,14,15},
		               {21,22,23,24,25},
		               {31,32,33,34,35}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
			
		}

	}

}
