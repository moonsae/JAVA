package day12.다형성예제;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dance_NJ2 g = new Dance_NJ2();
		dance_(g);
		
	
	}
	public static void dance_(Person2 p) {
		p.dance();
	}

}
