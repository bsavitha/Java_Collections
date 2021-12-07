package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LanguageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> collection = new ArrayList();


		collection.add("hindi");
		collection.add("english");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("spanish");
		collection.add("urdu");	
		collection.add("malyalam");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("spanish");
		collection.add("urdu");	
		collection.add("malyalam");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("spanish");
		collection.add("urdu");	
		collection.add("malyalam");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("spanish");
		collection.add("urdu");	
		collection.add("malyalam");
		collection.add("hindi");
		collection.add("CHINESE");
		collection.add("kannada");
		collection.add("tamil");
		collection.add("TELUGU");
		collection.add("tamil");

	
		
		System.out.println(collection.size());
		int lastIndex = 60;
		int firstIndex = 0;
		int mid = firstIndex + (lastIndex - firstIndex) / 2;
		System.out.println("Middle element is at index :");
		System.out.println(mid);

		if (mid == mid && mid < collection.size()) {
			System.out.println("Middle element present ? : ".concat(String.valueOf(collection.contains(mid))));
			 System.out.println("Removing.. " .concat(String.valueOf(collection.remove(mid) +" from index : " .concat(String.valueOf(mid)))));
		}
		
		System.out.println("Displaying...........");
		for (int i = 0; i < collection.size(); i++) {
			System.out.println(i);

		}

		
		
	}

}
