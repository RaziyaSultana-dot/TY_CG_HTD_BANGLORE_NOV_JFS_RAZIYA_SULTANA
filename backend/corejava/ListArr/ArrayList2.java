package com.capgemini.collection.ListArr;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1=new ArrayList<String>();
   a1.add("tani");
   a1.add("dinga");
   a1.add("dingi");
   a1.add("mangi");
   a1.add("tingi");
   System.out.println(a1);
   System.out.println(a1.size());
   System.out.println(a1.isEmpty());
   System.out.println(a1.contains("tani"));
   
   
   ArrayList<String> a2=new ArrayList<String>();
   a2.add("raani");
   a2.add("tim");
   a1.remove(3);
   System.out.println(a1);
   a2.addAll(2, a1);
   System.out.println(a2);
   System.out.println(a1);
   System.out.println(a2.containsAll(a1));
   System.out.println(a2);
   System.out.println(a2.retainAll(a1));
   System.out.println(a2);
   System.out.println(a2.removeAll(a2));
   System.out.println(a2);
   
   
   ArrayList<String> a3=new ArrayList<String>();
   a3.add("riya");
   a3.add("shan");
   a3.add("zoya");
   a3.add("sanath");
   a3.add("sara");
   
   
   ArrayList<String> a4=new ArrayList<String>();
   a4.add("tiya");
   a4.add("ahan");
   a4.add("qoya");
   a4.add("hanath");
   a4.add("tara");
   System.out.println(a4);
   
   a4.add(5, "hina");
   System.out.println(a4);
   a4.remove(2);
   System.out.println(a4);
   System.out.println(a4.indexOf("tara"));
   
   System.out.println(a3.lastIndexOf(a3));
   



   
   
	}

}
