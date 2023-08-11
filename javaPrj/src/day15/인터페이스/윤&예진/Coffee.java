package day15.정렬연습3;

public class Coffee {

	String name;
	int kal;
	int ml;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int kal, int ml) {
		super();
		this.name = name;
		this.kal = kal;
		this.ml = ml;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", kal=" + kal + ", ml=" + ml + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKal() {
		return kal;
	}

	public void setKal(int kal) {
		this.kal = kal;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}
	
	
}
