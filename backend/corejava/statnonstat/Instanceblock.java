
public class Instanceblock {
final int MAXIUM;
static double PI;

public Instanceblock()
{
	System.out.println("constructor is called");

}

public Instanceblock(int a) {
	System.out.println("constructor overloaded");
}

{
	System.out.println("instance initialiazer block executed");
	this.MAXIUM=5000;
}

static {
	System.out.println("static initializer block executes");
	PI=3.142;
}

}
