import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Student3> t=new TreeSet<Student3>();
		t.add(new Student3("arshu",22));
		t.add(new Student3("rashu",22));
		t.add(new Student3("sarhu",22));
		
		
		for(Student3 o:t) {
			System.out.println("student age is"+o.age);
			System.out.println("student name is"+o.name);
			System.out.println("-------------------------------");

		}
		
		
		

	}

}
