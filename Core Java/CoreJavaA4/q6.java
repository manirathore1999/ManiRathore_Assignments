package CoreJavaA4;

import java.util.ArrayList;
import java.util.List;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("hello");
		list.add("Mani");
		list.add("how");
		list.add("are");
		list.add("you");
          list.replaceAll(o->o.toUpperCase());
          System.out.println(list);
	}

}
