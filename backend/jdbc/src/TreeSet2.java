import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Student1>t1=new TreeSet<Student1>();
		t1.add(new Student1("taniya",85));
		t1.add(new Student1("saniya",45));
		t1.add(new Student1("ziya",87));
		
          
        	  for(Student1 s1 :t1) {
      			System.out.println(s1.name+"and age is"+s1.age);
      		}
      		
      		
}
}
		
		
		

	


