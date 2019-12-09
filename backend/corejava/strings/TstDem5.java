
public class TstDem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d1=new Demo5("johny",25);
		System.out.println(d1.hashCode());
		d1=new Demo5("malik",25);
		System.out.println(d1.hashCode());
		int age=d1.getage();
		String name=d1.getname();
		System.out.println(age);
		System.out.println(name);
		

	}

}
