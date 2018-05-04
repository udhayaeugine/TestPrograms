package com.Eugine.SamplePrgrm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {

		String st="I I am am eugine";
		
		checkDuplicateString(st);
	}

	static void checkDuplicateString(String st) {
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<>();
		
		String[] str=st.split(" ");
		
		for(String TempString:str) {
			
			if(hm.get(TempString)!=null) {
				
				hm.put(TempString, hm.get(TempString)+1);
			}
			else {
			hm.put(TempString, 1);
			}
		}
		System.out.println(hm);
		Set<String> keset=hm.keySet();
		ArrayList<String> ar=new ArrayList<String>(keset);
		
		for(String s:ar)
		System.out.print(s+" ");
		
	}

}
