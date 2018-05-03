package com.Eugine.TestPrgrm;

public class BinarySearchSimple {

	public static void Searchbinry(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("element is found at " + mid+ " value is "+arr[mid]);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last);
		}
		if (first > last) {
			System.out.println("Element is not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int last = array.length - 1;
		int key = 50;
		Searchbinry(array, 0, last, key);

	}

}
