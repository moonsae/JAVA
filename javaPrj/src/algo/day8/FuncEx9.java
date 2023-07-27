package algo.day8;

public class FuncEx9 {

	public static void main(String[] args) {

		// 지역변수 : 함수 안에서 만든 변수는 그 함수안에서 유효하다.
		// 변수의 유효범위
		
		String[] days= new String[3];
		
		int i=0; //배열의 index
		insertDay(days, i);
		selectDay(days, i);
	}

	public static void selectDay(String[] days, int i) {
		for(String day: days) {
			System.out.println(day);
		}
	}
	
	public static void insertDay(String[] a, int index) {
		a[index]="놀러가기";
	}

}
