package day12.Qz;

public class Day {
	int num;
	String shcedule;
	
	public Day() {}
	public Day(int num, String shcedule) {
		this.num = num;
		this.shcedule = shcedule;
	}
	public String toString() {
		return num+". "+shcedule;
	}

}
