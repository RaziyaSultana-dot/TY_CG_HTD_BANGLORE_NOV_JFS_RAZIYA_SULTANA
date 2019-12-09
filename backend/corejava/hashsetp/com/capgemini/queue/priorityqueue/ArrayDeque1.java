package com.capgemini.queue.priorityqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque a1=new ArrayDeque();
		a1.add(23);
		a1.add(52);
		a1.add(18);
		a1.add(36);
		 Iterator itr = a1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println(a1);
		 a1.addFirst(96);
		 a1.addLast(73);
		 System.out.println(a1);
		 
		 System.out.println(a1.getFirst());
		 System.out.println(a1.getLast());
		 System.out.println(a1.remove(18));
		 System.out.println(a1);
		 System.out.println(a1.removeFirst());
		 System.out.println(a1.removeLast());
		System.out.println(a1.peek());
		 System.out.println(a1);
		 
		
		 
		 

	}

}
