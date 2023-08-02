package day12.다형성예제;

public abstract class Person2 {
    // dance 매서드는 구현이 정상적으로 된 코드이다.
	
	public void 걷는다() {
		System.out.println("걷는다.");
	}
	public abstract void dance(); //미완성 매서드 선언부만 가지고 있는것, 미완성 매서드 abstract
    // 매서드 선언부만 가지고 있는 것	
	
	

}

// 추상매서드를 하나라도 가지면 추상클래스가 된다.
// 일반매서드도 가질 수 있다.


// 매서드
// 매서드 선언부
// 매서드 정의부(구현부){}
