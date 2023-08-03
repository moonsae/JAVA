package day13.ObjectEx;

// public class B extends Object 
public class B {

	int number;
	public B() {}
	public B(int number) {
		super();
		this.number = number;
	}
	@Override
	public String toString() {
		return number+"입니다.";
	}
	 
	
	 @Override                // 비교대상
	public boolean equals(Object obj) {
		 boolean result=false;
		 
		 B b= (B)obj;
		 
		 if( this.number == b.number) {
			 result=true;
		 }
		return  result;
	}
}
