
public class Crush {
	void receive(Phone p)
	{
		if (p instanceof Basic)
		{
			System.out.println("thanks");
		}
		
		else if (p instanceof Oppo)
		{
			System.out.println("thank q");
		}
		
		else if (p instanceof Oneplus)
		{
			System.out.println("thank q soo much dear");
		}
		
		else if (p instanceof Apple)
		{
			System.out.println("Love u");
		}
		
		else
		{
			System.out.println("go to hell");
		}
	}

}
