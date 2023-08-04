package day14.실습과제;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Qz_1_name {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader
					(new FileReader("res/acorn.txt"));
			int count = 1;
			while(true) {
				String data = bf.readLine();
				if(data==null)break;
				String data1 = data.substring(20);
				System.out.println(data1);
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
