import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(12);
		l1.add(23);
		l1.add(null);
		l1.add(12);
		
		Iterator itr =l1.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

	
	}


