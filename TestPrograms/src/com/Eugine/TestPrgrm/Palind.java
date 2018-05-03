package com.Eugine.TestPrgrm;

public class Palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ValueToCheck = 98989, reverse = 0, sum = 0, temp;

		temp = ValueToCheck;
		while (ValueToCheck > 0) {
			reverse = ValueToCheck % 10;
			sum = (sum * 10) + reverse;
			ValueToCheck = ValueToCheck / 10;

		}
		if (temp == sum) {
			System.out.println(sum + " It is Palindrome ");
		} else
			System.out.println(sum + " it is not a palindrome ");

	}

}
