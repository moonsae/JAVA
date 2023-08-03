package day12.Qz.문제2;

public class Kpop extends Music {
	public Kpop(String title, String singer) {
		super(title,singer);
	}
	@Override
	public String toString() {
		return "타이틀: "+title+"\t가수: "+singer;
	}

}
