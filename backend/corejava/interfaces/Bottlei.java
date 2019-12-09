package com.capgemini.interfaces.interfaces;

public interface Bottlei {
	void drink();
	void open();
	default void juice()
	{
		System.out.println("juice is filled in bottle");
	}

	static void close()
	{
		System.out.println("bottle is closed");
	}
}
