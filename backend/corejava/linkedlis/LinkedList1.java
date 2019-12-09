import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(14);
		l1.add(10);
		l1.add(30);
		l1.add(25);
		l1.add(30);
		
		System.out.println(l1);
		ListIterator ltr = l1.listIterator();
		
		while(ltr.hasNext()) {
		System.out.println(ltr.next());
		
		}
		
		l1.add( 20);
		System.out.println(l1);
		
		l1.remove(new Integer (25));
		System.out.println(l1);
		l1.add(null);
		System.out.println(l1);
		
		System.out.println("------for each loop---");
		for(Object i1: l1) {
			System.out.println(i1);
		}
		
		System.out.println("----for each loop---");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}

}
