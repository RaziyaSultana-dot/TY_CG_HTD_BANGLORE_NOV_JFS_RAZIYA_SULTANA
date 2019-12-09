package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue p1=new PriorityQueue();
		p1.offer(76);
		p1.offer(12);
		p1.offer(89);
		p1.offer(45);
		System.out.println(p1);
		p1.poll();
		p1.poll();
		System.out.println(p1);
		
		for(Object o1:p1)
		{
			System.out.println(o1);
		}
		p1.offer(67);
		p1.offer(35);
		System.out.println(p1);
        p1.remove();
        for(Object o1:p1)
		{
			System.out.println(o1);
		}
      System.out.println("______________");
      
        System.out.println( p1.element());
        System.out.println( p1.peek());
	}

}
