package algo.day8;
import java.util.Scanner;
public class FuncQz {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int menu=0;
		while(true) {
			System.out.println("문제의 번호를 입력하세요 ");
			System.out.println("----------------------");
			System.out.println("1. 두 수의 합을 구하는 함수 만들기");
			System.out.println("2. 별 5개를 출력하는 함수 만들기");
			System.out.println("3. 두원하는 별을 출력하는 함수 만들기");
			System.out.println("4. \"안녕하세요\"를 출력하는 함수 만들기");
			System.out.println("5. 자신이 만든 화폐구하기를 함수 만들기");
			System.out.println("6. 일주일간의 날씨정보를 반환하는 함수 만들기");
			System.out.println("7. 짝수(2~10),   홀수(1~9) 를 반환하는 함수 만들기");
			System.out.println("8. 문자열을 정수로 변환");
			System.out.println("0. 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 선택 => ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				sum();
				break;
			case 2:
				printStar();
				break;
			case 3:
				starNum();
				break;
			case 4:
				hello();
				break;
			case 5:
				countMoney();
				break;
			case 6:
				String[][] wea = weather();
				System.out.println("지난 한 주간의 날씨입니다. ");
				for(int i=0; i<wea[0].length; i++) {
					System.out.println(wea[0][i]+ "의 날씨 => "+wea[1][i]);
				}
				break;
			case 7:
				oddEven();
				break;
			case 8:
				strInt();
				break;
			
			case 0:
				return;
					
			}
		}
		
	}
	
	public static void sum() {
		System.out.println("두 수의 합을 구하는 함수");
		System.out.print("두 수를 입력하세요. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println(a+"와 "+b+"의 합은 "+sum+"입니다. ");
	}
	public static void printStar() {
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void starNum() {
		System.out.print("별의 수를 입력하세요 ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void hello() {
		System.out.println("안녕하세요");
	}
	public static void countMoney() {
		int[] won = {50000, 10000, 5000,1000,500,100,50,10};
		int[] pay = new int[8];
        System.out.printf("금액을 입력하세요 ");
		int num = sc.nextInt();
		int rem = num;
		for(int i=0; i<won.length; i++) {
			pay[i] = rem/won[i];
			rem = rem%won[i];
		}
		System.out.println("출장비: "+num);
		System.out.println("각 화폐 매수");
		for(int i=0; i<won.length; i++) {
			System.out.println(won[i]+" => "+pay[i]);
		}
	}	
	public static String[][] weather() {
		String[][] info = {{"월요일","화요일","수요일","목요일","금요일","토요일","일요일"},
				            {"맑음","흐림","비","눈","맑음","비","흐림"}
		                   };
		return info;

	}
	public static void oddEven() {
		System.out.println("숫자를 입력하세요(1~9) ");
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();}
		for(int i=0; i<num.length; i++) {
				if(num[i]%2==0)
				{
					System.out.println(num[i]+"은 짝수입니다. ");
				}
				else {
					System.out.println(num[i]+"은 홀수입니다. ");
				}
			}
	
	}
	public static void strInt() {
		System.out.printf("문자열로 입력할 숫자를 입력하세요 ");
		String str = sc.next();
	    int[] numArr = new int[10];
	    int index = 0;
	    int result = 0;
	    for(int i=0; i<str.length(); i++) {
	    	numArr[i] = str.charAt(i)-48;
	    	index++;
	    }
	    for(int i=0; i<str.length(); i++) {
	        if(i==0) {
	        	result = numArr[i]*1;
	        }
	        else {
	        	result = (result*10)+numArr[i];
	        }
	    }
	    
	    // 
	    
	    System.out.println(result);
		
		
	}
	
	public static int strInt2(String str) {
	 
	    int[] numArr = new int[10];
	    int index = 0;
	    int result = 0;
	    for(int i=0; i<str.length(); i++) {
	    	numArr[i] = str.charAt(i)-48;
	    	index++;
	    }
	    for(int i=0; i<index; i++) {
	        if(i==0) {
	        	result = numArr[i]*1;
	        }
	        else {
	        	result = (result*10)+numArr[i];
	        }
	    }
	    
	    // 
	    return result;
		
		
	}
	/*
	public class MyLib {
		
		public static void main(String[] args) {
			  int  rate = parseInt("10");		  
			  int  bonus   =  25000 *rate;
			  System.out.println(bonus);
		}
		
		public static int parseInt( String str) {		
			int result=0;
			for( int i=0;  i< str.length() ;i++) {			
				char su_  = str.charAt(i);
				int su = su_-48;
				result = result * 10 +  su;		
			}	
			return result;			
		}

	}*/

}
