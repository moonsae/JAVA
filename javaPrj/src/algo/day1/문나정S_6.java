package algo.day1;

public class 문나정S_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double 자료형 
        double sum=0;//항의 누적합
        int multi=1;//분모
        int i=1; // 항의 순번(반복제어변수)이자 분자
        int a = -1; //부호를 구할 변수
        
        final int MAX=3;
        
        sum += multi; //sum = sum + multi;
        
        // sum = multi;
        
        while(i<MAX) {
        	i+=1;
        	multi = i*multi;
        	sum = sum+(a*((i/(double)multi)));
        	a=-a;
        }
        System.out.println(sum);
        
        double result = 3/(double)6; // 정수/정수 -> 정수
        System.out.println("result"+result);
        
        // 정수 + 정수 => 정수연산
        // 정수 + 실수 => 실수연산
        
	}

}
