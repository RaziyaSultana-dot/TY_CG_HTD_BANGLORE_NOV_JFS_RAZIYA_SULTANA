package com.capgemini.arrays.intro;

public class Ola {
	GoogleMap g1;
	Ola(GoogleMap g1){
		this.g1=g1;
	}
	void find(String a)
	{
		try {
			g1.findlocation(a);
		}
		catch (NullPointerException e) {
			System.out.println("dear ola user please fill the loc details");
		}
	}
	{
		
	}

}
