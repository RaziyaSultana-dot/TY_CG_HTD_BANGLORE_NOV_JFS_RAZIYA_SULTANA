import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 =new Vector();
		v1.addElement(55);
		v1.addElement(52);
		v1.addElement(71);
		v1.addElement(44);
		System.out.println(v1);

		v1.remove(new Integer(52));
		System.out.println(v1);

		Object i1[]=new Object[v1.size()];
		v1.copyInto(i1);
		for(int i=0;i<v1.size();i++) {
			System.out.println(i1[i]);

		}
		v1.trimToSize();
		System.out.println(v1);
		v1.ensureCapacity(4);
		v1.setSize(6);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);

	}
}
