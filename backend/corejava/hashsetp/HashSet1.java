import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(86);
		hs.add(null);
		hs.add(12);
		hs.add(44);
		hs.add(23);
		for(Object object: hs) {
			System.out.println(object);
		}
		

	}

}
