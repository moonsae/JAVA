package day11.inheritance.practice;

import javax.swing.tree.VariableHeightLayoutCache;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Cycle c2 = new Cycle();
		
		ride(c1);
		ride(c2);
		
		repair(c1);
		repair(c2);
 
	}
	public static void ride(Vehicle vh) {
		vh.타다();
	}
	public static void repair(Vehicle vh) {
		vh.수리하다();
	}

}
