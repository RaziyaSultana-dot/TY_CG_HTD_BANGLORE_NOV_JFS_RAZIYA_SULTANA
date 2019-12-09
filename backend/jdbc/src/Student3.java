
public   class Student3 implements Comparable<Student3>{
	String name;
	int age;
	
	
	public Student3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		if(this.age > o.age) {
			return 0;			
			}
			else if(this.age < o.age) {
				return 1;
			}	
			else return -1;		
	}
	
}
