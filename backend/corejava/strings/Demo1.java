
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("john");
		System.out.println(s1.hashCode());
		
		String s2=new String("mike");
		String s3=new String("john");
		s1=new String("taniya");
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());
		

	}

}
