package Project;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerMgr {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> list = new ArrayList<>();
	int index=0;
	private String id;
	private String pw;
	private String address;
	private String phone;
	private int totalCost;
	private int totalPoint;
	private Membership mmsh;
	public CustomerMgr() {}
	public void init(MembershipMgr mm) { // 고객 정보 초기화
		list.add(new Customer("aaa","aaa123","aaa의 주소","010-4032-2222",32,2310,mm.FindMembership(32)));
		list.add(new Customer("bbb","bbb123","bbb의 주소","010-4444-3333",7,84,mm.FindMembership(7)));
		list.add(new Customer("ccc","ccc123","ccc의 주소","010-4568-4698",77,5560,mm.FindMembership(77)));
		list.add(new Customer("ddd","ddd123 ","ddd의 주소" ,"010-2248-5635",105,35810,mm.FindMembership(105)));
		list.add(new Customer("eee","eee123 ","eee의 주소","010-1111-1111",110,35810,mm.FindMembership(110)));
		list.add(new Customer("fff","fff123 ","fff의 주소","010-2222-2222",80,35810,mm.FindMembership(80)));
		list.add(new Customer("ggg","ggg123 ","ggg의 주소","010-3333-3333",36,35810,mm.FindMembership(36)));
		list.add(new Customer("hhh","hhh123 ","hhh의 주소","010-4444-4444",250,35810,mm.FindMembership(250)));
		list.add(new Customer("iii","iii123 ","iii의 주소","010-5555-6666",7,35810,mm.FindMembership(7)));
		
		
	}
	
	public void search() { // 조회
		System.out.println("회원을 조회합니다.");
		for (int i = 0; i < list.size(); i++) {
			Customer customer = list.get(i);
			System.out.println(customer);
		}
	}
	public void inputData (MembershipMgr mm) { // 등록
		System.out.println("-----회원가입-----");
		System.out.println("아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pw = sc.nextLine();
		System.out.println("주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.println("휴대폰 번호를 입력해세요 : ");
		String phone = sc.nextLine();
		int totalCost= 0;
		int totalPoint = 0;
		Customer c = new Customer(id, pw, address, phone, totalCost, totalPoint,mm.FindMembership(totalCost));
		list.add(c);
		System.out.println("----회원가입 완료-------");
		System.out.println("당신의 ID는: " + id + " 주소는: " + address + " 폰번호는: " + phone + " 입니다");

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
		String log_id = sc.next();
		System.out.println("비밀번호 입력");
		String log_pw = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(log_id) && list.get(i).getPw().equals(log_pw)) {
				System.out.println("로그인 완료");
				break;
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
	
  

    public void showMember(MembershipMgr mm) {
    	System.out.println("1. GOLD OLIVE");
    	System.out.println("2. BLACK OLIVE");
    	System.out.println("3. GREEN OLIVE");
    	System.out.println("4. PINK OLIVE");
    	System.out.println("5. BABY OLIVE");
    	int num = sc.nextInt();
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i).getMmsh().equals(mm.mlist.get(num-1))) {
        		System.out.println(list.get(i));
        	}
        }
    }

    
    public void maxCost() {
    	Collections.sort(list ,  new CustomerComparator());
    	for(int i=0; i<list.size(); i++) {
    		Customer c = list.get(i);
    		System.out.println(c);
    	}
    }
   
  

}
