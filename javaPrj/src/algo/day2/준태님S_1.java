package algo.day2;

public class 준태님S_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hp=250; //h시 인구
		double hu = 0.036; //h시 증가률
		double hup = 0; // h시 증가인구
		
		double kp=180; //k시 인구
		double ku = 0.042; //k시 증가률
		double kup = 0; // k시 증가인구
		
		int y = 1999; // 기준년도
		int c = 0;
		int sum; // 출력변수 (k시가 h시의 인구를 초과하는 년도)
		
		while(kp<=hp) {
			hup = hp * hu; 
			hp = hp+ hup;
			
			kup = kp + ku;
			kp = kp + kup;
			
			c+=1;
		}
		sum = y+c;
		System.out.println(sum);

	}

}
