package day11.inheritance.practice;

public class Cycle extends Vehicle{

	@Override
	public void 타다() {
		System.out.println("자전거를 타다");
	}
	@Override
	public void 수리하다() {
		System.out.println("자전거를 수리하다");
	}
}
