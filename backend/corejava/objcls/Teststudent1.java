package com.capgemini.objectclass.objcls;

public class Teststudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 s1=new Student1();
Object o1 = null;
try {
	o1 = s1.clone();
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Student1 s2=(Student1)o1;
System.out.println(s2.name);

	}

}
