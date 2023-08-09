package prj;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer_Jw {
	
	String log_id;
	String log_pw;
	
	
	ArrayList<Customer> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public void inputData () { // 등록
		System.out.println("-----회원가입-----");
		System.out.println("아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pw = sc.nextLine();
		System.out.println("주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.println("휴대폰 번호를 입력해세요 : ");
		String phone = sc.nextLine();
		Customer c = new Customer(id, pw, address, phone);
		list.add(c);
		System.out.println("----회원가입 완료-------");
		System.out.println("당신의 ID는: " + id + " 주소는: " + address + " 폰번호는: " + phone + " 입니다");

	}

	public void search() { // 조회
		System.out.println("회원을 조회합니다.");
		for (int i = 0; i < list.size(); i++) {
			Customer customer = list.get(i);
			System.out.println(customer);
		}
	}

	public void delete() { // 삭제
		System.out.println("----회원삭제-----");
		System.out.println("삭제할 회원의 아이디를 입력해주세요");
		String id = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				list.remove(i);
				System.out.println("삭제되었습니다...");
			} else
				System.out.println("등록된 회원이 아닙니다...");
		}

	}
	
	public void login() {
		System.out.println("아이디 입력");
		log_id = sc.next();
		System.out.println("비밀번호 입력");
		log_pw = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(log_id) && list.get(i).getPw().equals(log_pw)) {
				System.out.println("로그인 완료");
			}else if(!list.get(i).getId().equals(log_id)) {
				System.out.println("없는 아이디 입니다.");
			}else if(list.get(i).getId().equals(log_id) && !list.get(i).getPw().equals(log_pw)) {
				System.out.println("없는 비밀번호 입니다.");  
			}
		}
		
	}
	public void update() { // 정보수정
		System.out.println("수정할 아이디를 입력");
		String id=sc.next();
		for(int i=0; i<list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				
				System.out.println("수정하실 항목을 선택하세요. (1)아이디 (2)비밀번호 (3)주소 (4)번호");
				int n=sc.nextInt();
				System.out.println();
				
				switch(n) {
				case 1:
					System.out.println("새로운 아이디를 입력하세요");
					String id2 = sc.next();
					list.get(i).setId(id2);
					break;
				case 2:
					System.out.println("새로운 비밀번호를 입력하세요");
					String pw = sc.next();
					list.get(i).setPw(pw);
					break;
				case 3:
					System.out.println("새로운 주소를 입력하세요");
					String address = sc.next();
					list.get(i).setAddress(address);
					break;
				case 4:
					System.out.println("새로운 번호를 입력하세요");
					String phone = sc.next();
					list.get(i).setPhone(phone);
					break;
				}
			}
		}
	}

	
}
