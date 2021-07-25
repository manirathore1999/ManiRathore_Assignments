package CoreJavaA4;

import java.util.HashMap;
import java.util.Map;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> mp=new HashMap<>();
		mp.put("First ", 1);
		mp.put("Second ", 2);
		mp.put("Third ", 3);
		mp.put("Fourth ", 4);
		
		StringBuilder res = new StringBuilder();
    	for(Map.Entry<String,Integer> m : mp.entrySet()) {
    		res.append(m.getKey()+m.getValue());
    	}
		System.out.println(res.toString());

	}

}
