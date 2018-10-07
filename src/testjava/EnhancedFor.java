package testjava;
import java.util.*;

public class EnhancedFor {
	public static void main(String[ ] args) {
		int[ ] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
		
		Collection c = new ArrayList();
		c.add(new String("today is Sunday !"));
		c.add(new String("I need to practise typing."));
		c.add(new String("nomatterwhat , it's enjoyable."));
		for (Object o:c) {
			System.out.println(o);
		}Set s = new HashSet();
		s.add("Hello");
		s.add("world");
		s.add("Hello");
		s.add("World");
		System.out.println(s);
		}
		
	}  
	
