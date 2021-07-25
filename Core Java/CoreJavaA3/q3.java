package CoreJavaA3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        } 
        
        LinkedHashSet<String> set1=new LinkedHashSet();  
        set1.add("One");    
        set1.add("Two");    
        set1.add("Three");   
        set1.add("Four");  
        set1.add("Five");  
        Iterator<String> i1=set1.iterator();  
        while(i1.hasNext())  
        {  
        System.out.println(i1.next());  
        } 

	}

}
