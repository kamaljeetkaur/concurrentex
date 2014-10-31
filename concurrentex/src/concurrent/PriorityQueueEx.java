package concurrent;

import java.util.Iterator;
import java.util.PriorityQueue;
// using iterator on priority queue does not guarantee ordering
public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> pr = new PriorityQueue<String>();
		pr.add("xyz");
		pr.add("XYZ");
		pr.add("sp");
		pr.add("123");
		pr.add("abc");
		
		pr.add("a");
		pr.add("b");
		Iterator it  =  pr.iterator();
		
		while (it.hasNext()) {
			String value = (String)it.next();
			System.out.println("elements :" +  value);
		}
		
			System.out.println("elements in loop  :" +  pr);
		
		System.out.println("Size is :" + pr.size());
	}
}
