package day14.실습과제;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Qz2_favorite {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/fruit.txt"));
			while(true) {
				String data = bf.readLine();
				if(data==null)break;
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
