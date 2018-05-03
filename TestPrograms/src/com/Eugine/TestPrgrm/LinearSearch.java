package com.Eugine.TestPrgrm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, n, search, array[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = s.nextInt();

		array = new int[n];

		System.out.println("Enter " + n + " Integers");

		for (c = 0; c < n; c++) {
			array[c] = s.nextInt();
		}

		System.out.println("Enter value to find ");
		search = s.nextInt();

		for (c = 0; c < n; c++) {
			if (array[c] == search) {
				System.out.println(search + " is present at location " + c + ".");
				break;
			}
			else {
				System.out.println(search +" is not present in array");
				break;
			}
		}

	}

}
