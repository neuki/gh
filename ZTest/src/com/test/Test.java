package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
    	
    	Data data = new Data();
    	data.setName("test");
    	
    	List<Data> myList = new ArrayList<>();
    	myList.add(data);
    	
    	System.out.println(myList.stream().filter(Predi.filterByName("test")).findFirst().isPresent());
    	myList.stream().peek(o -> { o.setName("neu"); System.out.println(o.toString()); }).count();
    }
    
}
