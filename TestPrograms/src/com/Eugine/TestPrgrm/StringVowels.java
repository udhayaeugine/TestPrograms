package com.Eugine.TestPrgrm;

import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		System.out.println("String is "+s);
		String newS=s.replaceAll("[AEIOUaeiou]", " ");
		System.out.println("String Without Vowels :"+newS);
	}

}
