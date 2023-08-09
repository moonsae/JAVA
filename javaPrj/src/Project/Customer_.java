package prj;

public class Customer {
	String id;
	String pw;
	String address;
	String phone;
	
	
	public Customer() {}
	
	public Customer(String id, String pw, String address, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.address = address;
		this.phone = phone;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", address=" + address + ", phone=" + phone + "]";
	}

	
	
	
	
}
