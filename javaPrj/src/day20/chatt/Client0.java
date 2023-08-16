package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client0 {


	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	public Client0() {
		// 서버의 ip, port
		try {
			s = new Socket("localhost",5500);
			System.out.println("서버에 요청!!");
			
			// 소켓 두 개의 기반 스트림이 있음
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			// 보내기
			dataSend();
			
			// 받기
			dataRecv();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void dataRecv() {
		try {
			String message = dis.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("메시지 작성 : ");
			String message = sc.nextLine();
			dos.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {

		new Client0();
		
	}

}
