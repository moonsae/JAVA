package algo.day6;
import java.util.Scanner;
public class Qz2_Arr {

	public static void main(String[] args) {

		int[] arr = new int[20];
		Scanner sc = new Scanner(System.in);
		int num=0;
		int index=0;
		loop: while(true) {
			System.out.printf("숫자를 입력하세요.(30이하만 입력가능, 0입력시 종료): ");
		    num = sc.nextInt();
			if(num==0) break loop;
			else if((num>30)||(num<0)) {
				System.out.println("잘못된 숫자 입력입니다. 다시 입력하세요.");
			}
			else {
				for(int i=1; i<=num/2; i++) {
					if(num%i==0) {
						arr[index]=i;
						index++;
					}
				}
				arr[index]=num;
				index++;
				System.out.println(num+"의 약수");
				for(int i=0; i<index; i++) {
					System.out.print(arr[i]+"   ");
				}
				System.out.println();
				index=0;
				
			}
			
		}
		
	}
}
