package CoreJavaA4;

import java.util.ArrayList;
import java.util.List;

public class q4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("how"); 
		list.add("are");
		list.add("you");
		list.add("mani");
		list.removeIf(i->i.length()%2!=0);
		System.out.println(list);
	}
	

}
