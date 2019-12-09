import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs1=new HashSet<Student>();
		hs1.add(new Student(22,"komo"));
		hs1.add(new Student(21,"huma"));
		
		hs1.add(new Student(24,"sunny"));
		
		hs1.add(new Student(22,"komo"));
		
		hs1.add(new Student(26,"huya"));
		for(Student s1 :hs1) {
			System.out.println(s1.stuName+"and age is"+s1.stuAge);
		}
		
		
		
		

	}

}
