package algo.day3;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =11, b =11, c=9, d=9;
		int result = 0;
		
		result = a++ + --b + c++ - d--;
		
		System.out.printf("%d",result);
		
		int myAge = 27;
		boolean result1= myAge > 25;
		System.out.println(result1);
		
		boolean result2= myAge >= 25;
		System.out.println(result2);
		
		boolean result3= myAge < 25;
		System.out.println(result3);
		
		boolean result4= myAge <= 25;
		System.out.println(result4);
		
		int yourAge=26;
		boolean result5= yourAge == 26;
		System.out.println(result5);
		
		boolean result6= yourAge != 27;
		System.out.println(result6);
		
		// 논리연산자 그리고(&&), 이거나 (||), 논리부정!
		
		int kor = 80;
		int eng = 100;
		
		// 두 과목 모두 90 이상이면 장학금 지급
		boolean result7 = kor >= 90 && eng >= 90;//둘 다 만족 참
		System.out.println("result7: "+result7);
		
		// 두 과목 중에서 한 과목이라도 90이상이면 장학금 지급
		boolean result8 = kor>=90 || eng >= 90;
		System.out.println("result8: "+result8);

		boolean result9 = !(kor>=80);
		System.out.println(result9);
		
		int score= 90;
		
		if(score>=90) {
			System.out.println("학점은 a");
		}
		else if(score>=80) {
			System.out.println("학점은 b");
		}
		
		
	}
//
	

}
