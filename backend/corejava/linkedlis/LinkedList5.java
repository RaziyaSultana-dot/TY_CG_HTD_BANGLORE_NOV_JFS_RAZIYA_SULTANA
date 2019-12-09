import java.util.Vector;

public class LinkedList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(23);
		v1.add(56);
		v1.add(78);
		v1.add(100);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		
		/*for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}*/
		v1.add(200);
		System.out.println(v1.size());
		System.out.println(v1);
		
		v1.set(5, 600);
		
		System.out.println(v1);
		
		
		
	

	}

}
