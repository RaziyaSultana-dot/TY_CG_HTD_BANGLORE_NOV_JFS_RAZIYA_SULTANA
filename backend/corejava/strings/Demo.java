
public class Demo {
	public static void main(String []args)
	{
		String s1="john";
		System.out.println("s1: "+s1.hashCode());
		String s2="mike";
		s1="dinga";
		String s3="john";
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s3: "+s3.hashCode());
		
	}

}
