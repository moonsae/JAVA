package day12.다형성예제;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dance_NJ g = new Dance_NJ();
		dance_(g);
		
	
	}
	public static void dance_(Person p) {
		p.dance();
	}

}
