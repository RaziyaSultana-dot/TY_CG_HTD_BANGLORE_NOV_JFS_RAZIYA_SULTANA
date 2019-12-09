
public class Demo3 {

	public static void main(String[] args) {
		String s1="Hiroshima";
		String s2="    Raziya sultana   ";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s2.trim());
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2, 6));
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.indexOf("ro"));
		System.out.println(s1.indexOf(s2, 4));
	}		

}
