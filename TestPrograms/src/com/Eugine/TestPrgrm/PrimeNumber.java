package com.Eugine.TestPrgrm;

public class PrimeNumber {

	public static void CheckPrimeNumber(int n) {
		int m;
		int flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println("It is not a prime number");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println("It is not a Prime Number ");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is a prime number");
			}
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckPrimeNumber(117);
	}

}
