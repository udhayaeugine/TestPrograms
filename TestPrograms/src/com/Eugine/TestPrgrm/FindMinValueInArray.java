package com.Eugine.TestPrgrm;

public class FindMinValueInArray {

	public static void main(String[] args) {
		int[] arr = { 20, 12, 34, 21, 563, 22, 32 };
		FindMiValue(arr);

	}

	private static void FindMiValue(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];

		}
		System.out.println(min + " Is the min value in array");
	}

}
