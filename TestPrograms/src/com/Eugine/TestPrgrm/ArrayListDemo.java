package com.Eugine.TestPrgrm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		int count=0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		list.add(103);
		for (Integer num : list) {
			if (num.equals(108)) {
				System.out.println("Number " + num);
				count++;
				
			}
		}
		if(count==0) {
			System.out.println("There is no such value in the list");
		}
		
	}

}
