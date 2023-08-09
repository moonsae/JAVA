package Project;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer>{
	@Override
	public int compare(Customer a, Customer b) {
		if(a.gettotalCost()<b.gettotalCost()) return 1;
		else if(a.gettotalCost()>b.gettotalCost()) return -1;
		else if(a.gettotalCost() == b.gettotalCost()) {
			if(a.getName().compareTo(b.getName())>0) return 1;
			else return -1;
		}
		return 0;
	}

}
