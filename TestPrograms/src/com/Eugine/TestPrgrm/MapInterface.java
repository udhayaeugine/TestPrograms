package com.Eugine.TestPrgrm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Isabella");
		m.put(2, "Mary");
		m.put(3, "Irudhaya Mary");
		m.put(4, "Loganathan");
		m.put(5, "Benny");

		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your Value");
		int g = sn.nextInt();
		
		Set<Entry<Integer, String>> entry = m.entrySet();
		int count=0;
		for(Entry<Integer,String> s1:entry) {
			if(s1.getKey().equals(g)) {
			System.out.println(s1.getValue()+" 'The Key is' "+s1.getKey());
			count++;
			}
		
		}
		if(count==0) {
			System.out.println("The value is not found");
		}
		
		
		
	}

}
