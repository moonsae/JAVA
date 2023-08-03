package day13.StringEx;

public class Ex03 {

	
	// 문자열 변경해야 하는 경우
	// append 
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("hello");
		s.setCharAt(1,'a');
        System.out.println(s);
        s.append("l like java");
        System.out.println(s);
	}

}
