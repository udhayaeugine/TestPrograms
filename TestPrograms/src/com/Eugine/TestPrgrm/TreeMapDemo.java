package com.Eugine.TestPrgrm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeMapDemo {

	public static void main(String[] args) {
		HashMap<String, Cricketter> tm = new HashMap<String, Cricketter>();

		tm.put("Eugine", new Cricketter("Eugine", 14000));
		tm.put("Benny", new Cricketter("Benny", 4000));
		tm.put("Isai", new Cricketter("Isai", 15000));

		Set<Map.Entry<String, Cricketter>> m = tm.entrySet();
		
		for (Map.Entry<String, Cricketter> s : m) {
			System.out.println(s.getKey() + " " + s.getValue());
		}

	}

}
