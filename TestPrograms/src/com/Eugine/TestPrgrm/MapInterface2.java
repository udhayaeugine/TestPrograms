package com.Eugine.TestPrgrm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> ls=new LinkedHashMap<Integer,String>();
		ls.put(100000, "1BHK");
		ls.put(20000, "2BHK");
		ls.put(30000, "3BHK");
		ls.put(40000, "4BHK");
		ls.put(50000, "5BHK");
		
		Set<Map.Entry<Integer,String>> hs= ls.entrySet();
		for(Map.Entry<Integer, String> l:hs) {
			System.out.println("Before Alter : "+l.getKey()+" "+l.getValue());
			
			double ran=Math.random()*10000;
			int e=(int)Math.round(ran);
					
		}
	}

}
