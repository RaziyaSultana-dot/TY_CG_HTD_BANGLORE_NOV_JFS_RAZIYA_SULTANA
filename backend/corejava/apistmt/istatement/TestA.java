package com.capgemini.apistmt.istatement;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------predicate---------");//always return boolean values
		Predicate<Integer> p=i -> i%2 ==0;
		
		boolean b1=p.test(12);
		System.out.println(b1);
		System.out.println(p.test(45));
		
		System.out.println("----------function----------");
		Function<Integer,Integer> f1=i->i*100;
		// here 1st integer gives type of input and 2nd integer giver type of return type
		int a=f1.apply(86);
		System.out.println(a);
		
		System.out.println("------------supplier------------");
		Supplier<Person> s1 = () -> new Person(23,"shannu");
		System.out.println(s1.get().getAge());
		System.out.println(s1.get().getName());

		Consumer<Person> c1 = j ->{
			System.out.println(j.getAge());
			System.out.println(j.getName());
		};
		Person p1=new Person(21,"raziya");
		c1.accept(p1);
		
		}
}
