package concurrent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*        Throws exception   	Returns special value
Insert 	    add(e) 	             offer(e)
Remove 	    remove() 	         poll()
Examine 	element() 	         peek()*/

public class QueueEx {

	public static void main(String[] args) {

		Queue<String> qe = new LinkedList<String>();
		
		qe.add("b");
		qe.add("a");
		qe.add("c");
		qe.add("e");
		qe.add("d");
		
		
		
		System.out.println("Initial Size of Queue :" + qe.size());
		System.out.println("add element : " + qe.offer("new"));
		System.out.println("Added Size of Queue :" + qe.size());
		System.out.println("remove element: " + qe.poll());
		System.out.println("Removed Size of Queue :" + qe.size());
		System.out.println("retrieve first element : " + qe.peek());
		System.out.println("final Size of Queue :" + qe.size());
		
		System.out.println("remove from first : "+ qe.offer(null));
		Iterator<String> it = qe.iterator();
		
		while(it.hasNext()) {
			System.out.println("Queue Next Value : " + it.next());
		}
		
		
	/*	qe.clear();
		
	//	System.out.println("Throw exception1" + qe.remove());
	//	System.out.println("Throw exception2" + qe.element());
		System.out.println("Throw exception" + qe.add("first"));
		
		
		
		while(it.hasNext()) {
			System.out.println("Queue Next Value : " + it.next());
		}
		
		System.out.println("retrieve first element : " + qe.peek());
		
		qe.add("b");
		qe.add("a");
		qe.add("c");
		qe.add("e");
		qe.add("d");
		
		while(it.hasNext()) {
			System.out.println("Queue Next Value : " + it.next());
		}		
		
*/
		


	}

}
