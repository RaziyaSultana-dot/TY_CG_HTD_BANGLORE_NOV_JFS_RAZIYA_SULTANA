package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		
		p1.offer(new Student(22,"divine"));
		p1.offer(new Student(25,"livine"));
		p1.offer(new Student(25,"sivilne"));
		
		for(Object object:p1) {
			System.out.println(object);
		}
		
	}

}
