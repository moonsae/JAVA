package day11.inheritance.practice;

public class Car extends Vehicle{
	@Override
	public void 타다() {
		System.out.println("자동차를 운전하다.");
	}
	@Override
	public void 수리하다() {
		System.out.println("자동차를 수리하다");
	}

}
