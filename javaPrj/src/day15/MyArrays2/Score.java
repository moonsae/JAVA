package day15.정렬;


public class Score implements Comparable{

	private String name;
	private int kor;
	private int eng;
	
	//생성자
	// 
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	// toString()
	//
	
	
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	
	@Override
	public int compareTo(Object o) {  //  자신과 another 객체 비교   자신이크면 양수, 아니면 음수
		 Score s = (Score)o;		 
		return this.getEng() - s.getEng();
	}		
	
	
}
