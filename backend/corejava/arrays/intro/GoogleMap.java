package com.capgemini.arrays.intro;

public class GoogleMap {
	void findlocation(String location) {
		try {
			System.out.println(location.length());
			
		}
		catch(NullPointerException n)
		{
			System.out.println("please fill the details-GM");
			throw n;
		}
	}

}
