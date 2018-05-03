package com.Eugine.TestPrgrm;

public class ThreadClass extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread " + i);
		}
	}

	public static void main(String[] args) {
		ThreadClass t = new ThreadClass();
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("Parent thread : "+j);
		}
	}

}
