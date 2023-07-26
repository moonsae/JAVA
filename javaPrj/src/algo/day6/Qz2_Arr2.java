package algo.day6;
import java.util.Scanner;
public class Qz2_Arr2 {

	public static void main(String[] args) {

		int[] arr = new int[20];
		Scanner sc = new Scanner(System.in);
		int num=0;
		int index=0;
		loop: while(true) {
			do {
				System.out.printf("숫자를 입력하세요.(30이하만 입력가능, 0입력시 종료): ");
			    num = sc.nextInt();
			} while(num>30  || num <0);
			
			if(num==0) break loop;
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
