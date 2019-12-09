import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHAshset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee("yasra",22));
		l1.add(new Employee("alia",24));
		l1.add(new Employee("asra",27));
		l1.add(new Employee("aarzoo",25));
		
		Iterator<Employee> itr =l1.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for(Employee e1 :l1) {
			System.out.println(e1.empName+" and age is"+e1.empAge);
		}
		
		

	}

}
