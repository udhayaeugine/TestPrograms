package com.Eugine.SamplePrgrm;

import java.util.Arrays;

public class MultipleMain {
	public static void main() {
		int k;
		for(k=1;k<5;k++) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleMain.main();
		int a=6,b=7;
		System.out.println("A "+a+" B "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A "+a+" B "+b);
		
		System.out.println(" =========== ");
		
		int numbers[] = {6,3,37,12,46,5,64,21};
		Arrays.sort(numbers);
		System.out.println("First max value "+numbers[numbers.length-1]);
		System.out.println("Second max value "+numbers[numbers.length-2]);
/*		int highest = 0;
		 int second_highest = 0;
		 
		for(int n:numbers){
		 
		if(highest < n){
		 
		      second_highest = highest;
		      highest =n;
		      System.out.println("Highest "+highest);
		 
		 } else if(second_highest < n){
		 
		                second_highest = n;
		 
		}
		 
		}
		        System.out.println("First Max Number: "+highest);
		        System.out.println("Second Max Number: "+second_highest);*/

		 
		 }
	}

