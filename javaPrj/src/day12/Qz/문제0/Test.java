package day12.Qz.문제0;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		sound(cat);
		sound(dog);

	}


public static void sound(Animal ani) {
	ani.짖다();
}
}
