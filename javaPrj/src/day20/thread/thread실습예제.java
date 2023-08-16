package day20.thread;

import java.util.ArrayList;

public class thread실습예제 {
	static int NUM;
	static ArrayList <String> list = new ArrayList<>();
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
		try {
            a.join(); // 메인 스레드가 A 스레드의 종료를 기다림
            b.join(); // 메인 스레드가 B 스레드의 종료를 기다림
            c.join(); // 메인 스레드가 C 스레드의 종료를 기다림
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}

}

class A extends Thread{
	@Override
	public void run() {
		for( int i= 20; i<= 200; i=i+20) {
			System.out.println("A "+i+"만큼 전진");
			if(i==200) {
				System.out.println("A 도착");
				thread실습예제.list.add("A");
				thread실습예제.NUM++;
				System.out.println(thread실습예제.NUM);
				
			}
		}
    }
}
class B extends Thread{
	@Override
	public void run() {
		for( int i= 20; i<= 200; i=i+20) {
			System.out.println("B "+i+"만큼 전진");
			if(i==200) {
				System.out.println("B 도착");
				thread실습예제.list.add("B");
				thread실습예제.NUM++;
				System.out.println(thread실습예제.NUM);
			}
		}
	}
}
class C extends Thread{
	@Override
	public void run() {
		for( int i= 20; i<= 200; i=i+20) {
			System.out.println("C "+i+"만큼 전진");
			if(i==200) {
				System.out.println("C 도착");
				thread실습예제.list.add("C");
				thread실습예제.NUM++;
				System.out.println(thread실습예제.NUM);
			}
		}
	}
}
