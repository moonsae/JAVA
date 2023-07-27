package algo.day8;

public class FuncEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSum(); //함수 호출

	}

	             // void =>반환값이 없다
	             // 함수type 함수명() // (입력정보)
	public static void getSum() {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum+=1;
		}
		System.out.println(sum);
	}

}
