package day12.Qz.문제2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Music[] music = new Music[5];
		music[0]= new Kpop("Super Shy","NewJeans");
		music[1]= new Kpop("Seven","정국");
		music[2]= new Pop("A change of Heat","The 1975");
		music[3]= new Pop("Let her go","Passenger");
		music[4]= new Pop("Hurricane","Cannons");
		
		for(int i=0; i<music.length; i++) {
			if(music[i] instanceof Kpop) {
				System.out.println("Kpop\t"+ music[i]);
			}
			else {
				System.out.println("Pop\t"+ music[i]);
			}
		}
	}

}
