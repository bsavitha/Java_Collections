package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FestivalCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> collection = new ArrayList<String>();

		collection.add("diwali");
		collection.add("pongal");
		collection.add("Makar sakranti");
		collection.add("kumbh");
		collection.add("republic day");
		collection.add("lohri");
		collection.add("basant");
		collection.add("maha shivartri");
		collection.add("carnival");
		collection.add("losar");
		collection.add("holi");
		collection.add("navaratri");
		collection.add("ugadi");
		collection.add("gudi padwa");
		collection.add("mewar");
		collection.add("estar");
		collection.add("baisakthi");
		collection.add("thrissur pooram ");
		collection.add("buddha jayanthi");
		collection.add("eid");
		collection.add("hrmis");
		collection.add("ratha yatra");
		collection.add("teej ");
		collection.add("rakshabandhan");
		collection.add("janmaasthami");
		collection.add("independence day");
		collection.add("oanam");
		collection.add("ganesh chaturthi");
		collection.add("durga puja");
		collection.add("dussehra");
		collection.add("govardhan puja");
		collection.add("camel festival");
		collection.add("chhath puja");
		collection.add("gurupurab");
		collection.add("horbill");
		collection.add("christmas");
		collection.add("mewar");
		collection.add("estar");
		collection.add("baisakthi");
		collection.add("thrissur pooram ");
		collection.add("buddha jayanthi");
		collection.add("eid");
		collection.add("hrmis");
		collection.add("ratha yatra");
		collection.add("lohri");
		collection.add("basant");
		collection.add("maha shivartri");
		collection.add("carnival");
		collection.add("losar");
		collection.add("holi");
		collection.add("navaratri");
		collection.add("ugadi");
		collection.add("gudi padwa");
		collection.add("mewar");
		collection.add("estar");
		collection.add("republic");
		collection.add("lohri");
		collection.add("basant");
		collection.add("maha shivartri");
		collection.add("carnival");

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
			//System.out.println(collection.indexOf(30));
			System.out.println(i);

		}
		
	}

}
