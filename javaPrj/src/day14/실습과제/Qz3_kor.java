package day14.실습과제;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Qz3_kor {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader
					(new FileReader("res/kor.txt"));
			int sum=0;
			double avg = 0;
			int count =0;
			while(true) {
				String data = bf.readLine();
				count++;
				if(data ==null)break;
				System.out.println(data);
				int dataNumber = Integer.parseInt(data);
				sum+= dataNumber;
			}
			avg= sum/count;
			System.out.println("총점: "+sum);
			System.out.println("평균: "+avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
