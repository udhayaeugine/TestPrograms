package com.Eugine.TestPrgrm;

import java.util.*;

public class LinearSerachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, search, n, array[];

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		n = s.nextInt();
		array = new int[n];

		System.out.println("Enter " + n + " Integers");

		for (i = 0; i < n; i++) {
			array[i] = s.nextInt();
		}

		System.out.println("Enter the number you want to search");
		search = s.nextInt();
		
		for (i = 0; i < n; i++) {
			if (array[i] == search) {
				System.out.println(search+" Place at " + i);
				break;
			} else {
				System.out.println(search+ " Integer is not available ");
				break;
			}
		}
		// System.out.println("Enter "+n+" integers");
		// for(i=0;i<n;i++)
		// {
		// array[i]==
		// }
		//

	}

}
