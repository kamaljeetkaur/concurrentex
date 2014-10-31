package concurrent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListQueue {

	public static void main(String[] args) {
		LinkedList<String> qe = new LinkedList<String>();

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
		
		System.out.println("Add at first :" + qe.offerFirst("First"));
		System.out.println("Add last :" + qe.offerLast("last"));
		
	//	System.out.println("Poll at first :" + qe.pollFirst());
	//	System.out.println("Poll last :" + qe.pollLast());
		
		qe.addFirst("first 2");
		qe.addLast("last 2");
		
		ListIterator<String> it = qe.listIterator();
		while(it.hasNext()) {
			System.out.println("elements :"+ it.next());
		}
		System.out.println("Finished");
		
		Iterator<String> it2 = qe.descendingIterator();
		while(it2.hasNext()) {
			System.out.println("elements :"+ it2.next());
		}
	
		System.out.println("Finished");
	}

}

/*
 * 
 * */
