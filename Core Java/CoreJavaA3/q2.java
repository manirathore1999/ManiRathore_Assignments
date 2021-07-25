package CoreJavaA3;

import java.util.ArrayList;
import java.util.ListIterator;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Amanda");
	      aList.add("Peter");
	      aList.add("Julie");
	      aList.add("James");
	      aList.add("Emma");
	      ListIterator<String> li = aList.listIterator();
	      while (li.hasNext()) {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }

	}

}
