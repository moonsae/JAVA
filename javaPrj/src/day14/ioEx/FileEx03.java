package day14.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {

		try {
			FileReader fis = new FileReader("res/acorn.txt");
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}

}
