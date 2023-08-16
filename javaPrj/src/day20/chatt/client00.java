package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client00 {

	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	public client00() {
		try {
			s = new Socket("61.73.130.228",6100);
			System.out.println("서버에 요청!!");
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			dataSend();
			dataRecv();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
						System.out.println("메시지 작성: ");
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
						System.out.print("서버에게 받은 메시지: ");
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}}});
		t.start();
	
	}
	public static void main(String[] args) {

		new client00();
	}

}
