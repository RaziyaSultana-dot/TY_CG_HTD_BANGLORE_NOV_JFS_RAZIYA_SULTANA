import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("prachi");
		hs.add("riya");
		hs.add(null);
		hs.add("tanu");
		for(Object object: hs) {
			System.out.println(object);
		}
		

	}

}
