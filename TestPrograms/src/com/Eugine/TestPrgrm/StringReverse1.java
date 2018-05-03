package com.Eugine.TestPrgrm;

public class StringReverse1 {

	public static void main(String[] args) {

		String s="Palindrome";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
