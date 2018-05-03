package com.Eugine.TestPrgrm;

public class LambdaExpression {

	public static void main(String[] args) {

		//Inner Class & Thread explanation using lambda Expression 
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Test Hi " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Print E" + e);
				}
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Test Hello " + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					System.out.println("Print E" + e);
				}
			}

		});
		t2.start();
	}

}
