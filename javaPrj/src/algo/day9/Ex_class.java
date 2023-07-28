package algo.day9;

public class Ex_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		book book1 = new book();
		book1.title = "아주 희미한 빛으로도";
		book1.price = 16800;
		book1.sale = 15120;
		
		System.out.println(book1.title);
		System.out.println(book1.price);
		System.out.println(book1.sale);
	}
	

}
class book{
	String title;
	int price;
	int sale;
}

