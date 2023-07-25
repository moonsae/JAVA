package algo.day4;

import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름: ");
		String name =sc.next();
		System.out.printf("국어점수: ");
		int kor = sc.nextInt();
		System.out.printf("영어점수: ");
		int eng = sc.nextInt();
		System.out.printf("수학점수: ");
		int math = sc.nextInt();
		
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		System.out.print("이름: "+name+"  국어: "+kor+"  영어: "+eng+"  수학: "+math+"  평균: "+avg);
		
	}

}
