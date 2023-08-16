package day20.thread;

public class 콜스택Ex {

	// 콜스택이란? 매서드 수행에 필요한 메모리가 제공되는 공간
	// 스택 : 먼저 들어온 것이 나중에 나가는 구조
	// 매서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제됨

	void 매서드1() {
		매서드2();
		System.out.println("매서드1 call");
	}
	void 매서드2() {
		System.out.println("매서드2 call");
	}
	public static void main(String[] args) {

		콜스택Ex p = new 콜스택Ex();
		p.매서드1();
		System.out.println("main bye");
	}

}
