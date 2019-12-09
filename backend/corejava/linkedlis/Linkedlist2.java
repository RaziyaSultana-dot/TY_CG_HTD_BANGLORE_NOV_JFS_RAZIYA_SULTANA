import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(28);
		l1.add(90);
		l1.add(10);
		
		l1.add(85);
		
		System.out.println("elements present are:"+l1);
		
		l1.addFirst(54);
		System.out.println("add first:"+l1);
		
		l1.addLast(39);
		System.out.println("add last:"+l1);
		
		l1.getFirst();
		System.out.println("get first:"+l1);
		
		l1.getLast();
		System.out.println("get last:"+l1);
		
		l1.remove(0);
		System.out.println("remove:"+l1);
		
		l1.removeFirst();
		System.out.println("remove first:"+l1);
		
		l1.removeLast();
		System.out.println("remove last:"+l1);
		
		l1.add(10);
		System.out.println("elements present are:"+l1);

		l1.removeFirstOccurrence(10);
		System.out.println("remove first occurence:"+l1);
		
		l1.add(28);
		l1.add(34);
		System.out.println("elements present are:"+l1);

		l1.removeLastOccurrence(28);
		System.out.println("remove last occurence:"+l1);
		

	}

}
