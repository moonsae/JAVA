package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server00 {
	ServerSocket ss;
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Server00(){
		try {
			ss = new ServerSocket(5800);
			System.out.println("서버 스타트@@@@");
			s = ss.accept();
			System.out.println("클라이언트 요청");
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			dataRecv();
			
			dataSend();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dataSend() {

		Scanner sc  = new Scanner(System.in);
		/*
		while(true) {
			try {
				System.out.println("메시지 작성: ");
				String message = sc.nextLine();
				dos.writeUTF(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				while(true) {
					try {
						System.out.print("메시지 작성: ");
						String message = sc.nextLine();
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}});
		t.start();
		
		
	}

	private void dataRecv() {
		/*
		while(true) {
			String message;
			try {
				message = dis.readUTF();
				System.out.println(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.print("클라이언트에게 받은 메시지: ");
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}}});
		t.start();
	
	}

	public static void main(String[] args) {

		new Server00();
	}

}
