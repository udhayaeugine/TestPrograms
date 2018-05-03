package com.Eugine.SamplePrgrm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("Udhaya");
		al.add("Eugine");
		al.add("Rampage");
		al.add("Google");
		
		String[] SA=new String[al.size()];
		
		al.toArray(SA);
		
		for(String Temp:SA) {
			System.out.println("String :"+Temp);
		}
	}

}
