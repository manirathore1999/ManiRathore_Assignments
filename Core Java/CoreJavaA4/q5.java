package CoreJavaA4;

import java.util.Arrays;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder firstLetter=new StringBuilder();
		Arrays.asList("hello","mani","how","are","you").forEach(o->firstLetter.append(o.charAt(0)));
		System.out.println(firstLetter);

	}

}
