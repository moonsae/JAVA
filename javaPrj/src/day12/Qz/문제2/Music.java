package day12.Qz.문제2;

public class Music {
	String title;
	String singer;
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return title+"\t"+singer;
	}

}
