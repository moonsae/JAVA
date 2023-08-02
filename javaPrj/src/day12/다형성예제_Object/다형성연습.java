package day12.다형성예제_Object;

import java.util.ArrayList;

public class 다형성연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//car, cat, person 참조형변수이다.
		// 우리가 상속을 하나라도 받지만 기본적울
		// object를 상속받는다.
		// 모든 객체는 object로 다뤄질 수 있다.
		Car car =new Car();
		Cat cat =new Cat();
	    Person person = new Person();
	    Wolf wolf =new Wolf();
	    
	    //참조형 변수 4개를 배열로 만든것임
	    // 객체가 만들어진것이 아니다.
	    Object[] arr = new Object[4];
	    arr[0] = car;
	    arr[1] = cat;
	    arr[2] = person;
	    arr[3] = wolf;
	    
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i].toString());
	    }
	    // 가변길이 배열, 순서, 증복허용
	    ArrayList list = new ArrayList();
	    list.add(cat);
	    list.add(car);
	    list.add(person);
	    list.add(wolf);
	    
	    for(Object o : list) {
	    	System.out.println(o.toString());
	    	if(o instanceof Cat) {
	    		((Cat)o).쥐를잡는다();
	    	}
	    }
	    
	    String str = "i like java";
	    char result = str.charAt(0);
	    boolean result2 = str.equals("i like java");
	    
	    Object obj = str;
	    
	    String str1 = "one";
	    String str2 = "two";
	    String str3 = "three";
	    
	    ArrayList strList = new ArrayList<>();
	    strList.add(str1);
	    strList.add(str2);
	    strList.add(str3);
	    
	    for(int i=0; i<strList.size(); i++) {
	    	Object o = strList.get(i);
	    	System.out.println(o);
	    	if( o instanceof String) {
	    	     String rtn =((String)o).toUpperCase();
	    	     System.out.println(rtn);
	    	}
	    }
	    
	    
	}

}
