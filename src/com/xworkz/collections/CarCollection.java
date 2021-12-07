package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CarCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> collection = new ArrayList();

		collection.add("BMW");
		collection.add("audi");
		collection.add("Benz");
		collection.add("carzilla");
		collection.add("chick magnet");
		collection.add("cowgirl up");
		collection.add("dark ghost");	
		collection.add("porsche");
		collection.add("bugatti");
		collection.add("i10");
		collection.add("i20");
		collection.add("harrier");
		collection.add("audiq4");
		collection.add("toyota");
		collection.add("innova");	
		collection.add("nano");
		collection.add("tata");
		collection.add("tata indoica");
		collection.add("nexon");
		collection.add("kia");
		collection.add("skoda");
		collection.add("honda");
		collection.add("cityzx");
		collection.add("kia");
		collection.add("fortuner ");
		collection.add("toyota");
		collection.add("audi");
		collection.add("tata");
		collection.add("kia");
		collection.add("inova");
		collection.add("aol autos staff");
		collection.add("dodge swinger ");
		collection.add("porsche carrera");	
		collection.add("bugatti veryron");
		collection.add("chevrolet corvette");
		collection.add("lamborghini");
		collection.add("ferrari");
		collection.add("rolls-royse");
		collection.add("ford mustang");
		collection.add("brimstone");
		collection.add("torch");
		collection.add("torcher");
		collection.add("Tesla");
		collection.add("jaguar");
		collection.add("honda");
		collection.add("audi q5");
		collection.add("AMG");
		collection.add("Maruthi Celio");
		collection.add("mazda laputa");
		collection.add("chevrolet nova");
		collection.add("hyundai kona");
		collection.add("toyota MR2");
		collection.add("audi TT Coupe");	
		collection.add("uno");
		collection.add("jazz");
		collection.add("pt crusiser");
		collection.add("pajero");
		collection.add("espero");
		collection.add("pinto");
		collection.add("kunga");

	
		
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
-
