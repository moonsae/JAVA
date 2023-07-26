package algo.day7;

public class Fnc_Ex8 {

		public static void main(String[] args) {
			int result1 =a(5);
			System.out.println(result1);
			int result2 =b('d');
			System.out.println(result2);
			char result3 =c(5);
			System.out.println(result3);
			double result4 =d();
			System.out.println(result4);
			String result5 =e();
			System.out.println(result5);
			
		}
		
		//1)
		public static int  a( int a ) {
		return 3;
		}
		
		//2)
		public static int b(char a){
		return 4;
		}
		
		//3)
		public static char c( int a){
		return 'c';
		}
		
		//4)//
		public static double d( ){
		return 2.5;
		}
		
		//5)
		public static String e(){
		return "안녕" ;
		}
	}



