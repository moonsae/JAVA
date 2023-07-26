package algo.day6;

import java.util.Scanner;
public class Primefac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fac = new int[20];

		Scanner sc = new Scanner(System.in);
		int index=0;
		int input=0;
		int num=0;
		while(true) {
			do {
				System.out.print("1보다 큰 숫자를 입력하세요 ");
				input = sc.nextInt();
				num = input;
			} while( input<2);
			while(input%2==0) {
				fac[index]=2;
				index++;
				input=input/2;
			}
			while(input%3==0) {
				fac[index]=3;
				index++;
				input=input/3;
			}
			while(input%5==0) {
				fac[index]=5;
				index++;
				input=input/5;
			}
			while(input%7==0) {
				fac[index]=7;
				index++;
				input=input/7;
			}
			if((input%2!=0)&&(input%3!=0)&&(input%5!=0)&&(input%7!=0)) {
				if(input!=1) {
					fac[index] = input;
					index++;
				}
			}
			System.out.print(num+"의 소인수분해 => ");
			for(int i=0; i<index; i++) {
				if(i==0) {
					System.out.print(fac[i]);
				}
				else {
					System.out.print(" * "+fac[i]);
				}
				
			}
			index=0;
			System.out.println();
		}
	
	
		
	}

	
}
