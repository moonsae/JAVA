package algo.day5;

public class Array3Ex {

	public static void main(String[] args) {

		int[][] even = new int[3][3];
		int a =2;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				even[i][j]=a;
				a+=2;
			}
		}
		
		int b =1;
		int[][] odd = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				odd[i][j]=b;
				b+=2;
			}
		}
	
		System.out.println("=======짝수 출력=======");
		for(int i=0; i<even.length; i++) {
			for(int j=0; j<even[i].length; j++) {
				System.out.print(even[i][j]+"\t");
			}
			System.out.println( );
		}
		System.out.println("=======홀수 출력=======");
		for(int i=0; i<odd.length; i++) {
			for(int j=0; j<odd[i].length; j++) {
				System.out.print(odd[i][j]+"\t");
			}
			System.out.println( );
		}
		
		System.out.println("====================");
		System.out.println("3 차원 배열");
		
		int[][] odd1 = new int[3][3];
		int v=1;
		for(int i=0; i<odd1.length; i++) {
			for(int j=0; j<odd[i].length; j++) {
				odd1[i][j] =v;
				v+=2;
			}
		}
		for(int i=0; i<odd1.length; i++) {
			for(int j=0; j<odd[i].length; j++) {
				System.out.print(odd[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
