package day10.test;

import com.acron.Calculator;

public class Cal_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1 = Calculator.add(5, 8);
		int result2 = Calculator.sub(5, 8);
		int result3 = Calculator.multi(5, 8);
		double result4 = Calculator.div(5, 8);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
