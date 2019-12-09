import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1=new TreeSet();
		t1.add(45);
		t1.add(71);
		t1.add(32);
		t1.add(34);
		//t1.add(null);
		
		t1.remove(34);
		
		for (Object object : t1) {
			System.out.println(object);
			
		}

	}

}
