package com.test;

import java.util.function.Predicate;

public class Predi {
	
	public static Predicate<Data> filterByName(String name) {
		return o -> o.getName().equals(name);
	}
	

}
