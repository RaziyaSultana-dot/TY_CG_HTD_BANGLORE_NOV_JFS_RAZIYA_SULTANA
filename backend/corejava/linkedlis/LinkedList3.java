import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(28);
		l1.add(90);
		l1.add(10);
		l1.add(85);
		System.out.println(l1);
		
		System.out.println("peek:"+l1.peek());
		System.out.println("peekf:"+l1.peekFirst());
		System.out.println("peeklast:"+l1.peekLast());
		
		System.out.println("poll:"+l1.poll());
		System.out.println(l1);
		System.out.println("poolf:"+l1.pollFirst());
		System.out.println(l1);
		System.out.println("poollast:"+l1.pollLast());
		System.out.println(l1);
		l1.offer(80);
		System.out.println("offer:"+l1);
		l1.offerFirst(288);
		System.out.println("offerf:"+l1);
		l1.offerLast(328);
		System.out.println("offerlast:"+l1);
		
		
		
		
	}

}
