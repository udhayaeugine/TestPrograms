package com.Eugine.TestPrgrm;

import java.util.Scanner;

public class BinarySearch {

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;

		while (first <= last) {

			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid + " value is " + arr[mid]);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210,
				220, 230, 240, 250 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the element you want to search");
		int key = sc.nextInt();
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);

	}

}
