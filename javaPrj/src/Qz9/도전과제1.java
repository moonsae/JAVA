package Qz9;

public class 도전과제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person james = new person();
		james.age = 40;
		james.name = "james";
		james.marriage = "기혼";
		james.children = 3;
		
		System.out.println("이 사람이 나이 "+james.age);
		System.out.println("이 사람이 이름 "+james.name);
		System.out.println("이 사람이 결혼  "+james.marriage);
		System.out.println("이 사람이 자녀수 "+james.children);
		
		

	}

}
class person{
	int age; 
	String name;
	String marriage;
	int children;
}