package com.capgemini.apistmt.istatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(50);
		a1.add(75);
		a1.add(78);
		a1.add(96);
		a1.add(79);
		a1.add(13);

		List<Integer> l1=a1.stream().filter(i -> i%2 !=0).collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> l2 =a1.stream().map(i -> i*100).collect(Collectors.toList());
		System.out.println(l2);

		Optional<Integer> a =a1.stream().max((i,j) -> i.compareTo(j));
		System.out.println(a);
		
		System.out.println(a1.stream().count());

	}

}
