package CoreJavaA3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class q8 {
	
	public static void main(String[] args) {
		List<String> names = new CopyOnWriteArrayList<>();
		names.add("Mani");
		names.add("Rathore");
		names.add("Sakshi");
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String name  = itr.next();
			if(name.equals("Mani")) {
				names.remove("Mani");
			}
			System.out.println(names.size());
		}
		
	}

}
