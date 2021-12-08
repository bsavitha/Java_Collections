package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ActorsCollection {

	public static void main(String[] args) {
		List<String> collection = new ArrayList();


		collection.add("vijay");
		collection.add("ajith");
		collection.add("surya");
		collection.add("sk");
		collection.add("vikranth");
		collection.add("disha");
		collection.add("karina");
		collection.add("kapoor");
		collection.add("sradha");
		collection.add("lora");
		collection.add("akshay");
		collection.add("kumar");
		collection.add("shreya");
		collection.add("nayantara");
		collection.add("Tom Hanks");
		collection.add("Hopkins");
		collection.add("Anthony ");
		collection.add("Robert ");
		collection.add("Judi ");
		collection.add("Prabhas");
		collection.add("Aamir Khan");
		collection.add("vijay devarakonda");
		collection.add("Glenn Close");
		collection.add("nayantara");
		collection.add("Aamir");
		collection.add("Rajinikanth");
		collection.add("disha patani");
		collection.add("sidarth");
		collection.add("sushanth");
		collection.add("Clint Eastwood");
		collection.add("Robert");
		collection.add("Prabhas");
		collection.add("Ram Charan");
		collection.add("arya");
		collection.add("keethi");
		collection.add("kreti");
		collection.add("Close");
		collection.add("tamil");
		collection.add("Aamir Khan");
		collection.add("Robert");
		collection.add("Dilip");
		collection.add("Ravi Kishan");
		collection.add("Radika");
		collection.add("Yash");
		collection.add("Prabhas");
		collection.add("karina");
		collection.add("Dilip Kumar");
		collection.add("Mithun Chakraborty");
		collection.add("Allu Arjun.");
		collection.add("mahesh babu");
		collection.add("Salman Khan");
		collection.add("spanish");
		collection.add("urdu");
		collection.add("malyalam");
		collection.add("Vijay Sethupathi");
		collection.add("puneeth");
		collection.add("Chakraborty");
		collection.add("anuska");
		collection.add("Kishan");
		collection.add("anuska sharma");

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
