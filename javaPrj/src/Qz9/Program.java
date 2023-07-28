package Qz9;
import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {

		Customer customer = new Customer("monset","123","김고객","부산");
		System.out.println(customer.toString());
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add( new Customer("m1" ,"123" ,"김고객" , "부산"));
		list.add( new Customer("m2" ,"123" ,"이고객" , "마산"));
		list.add( new Customer("m3" ,"123" ,"박고객" , "서울"));
		list.add( new Customer("m4" ,"123" ,"최고객" , "경기"));
		
		for(int i=0; i< list.size(); i++) {
		System.out.println( list.get(i).toString());
		
		}
	}

}

class Customer{
	private String id;
	private String pw;
	private String name;
	private String address;
	
	public Customer(String id, String pw, String name, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
	}
	public void setId(String id) {
		this.id= id;
	}
	public void setPw(String pw) {
		this.pw= pw;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + ", address=" + address + "]";
		} 
	
}