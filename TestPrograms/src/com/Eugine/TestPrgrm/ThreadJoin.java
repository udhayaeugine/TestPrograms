package com.Eugine.TestPrgrm;

public class ThreadJoin extends Thread {
	@SuppressWarnings("deprecation")
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1500);
				System.out.print("Thread :");
				
			} catch (InterruptedException e) {
				System.out.println("Catched Exception :" + e);
			}
			System.out.println(i);
		}
		ThreadJoin t3=new ThreadJoin();
		t3.start();
		System.out.println("Thread Subclass : " + Thread.currentThread().getName());
		try {
			t3.join();
			System.out.println("Join");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		
		if(Thread.currentThread().getName()=="Thread-3") {
			t1.stop();
			System.out.println("Thread Has been Stopped");
		}
		t1.start();
		System.out.println("Thread Name : " +Thread.currentThread().getName());

		try {
			t1.join();

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Main Thread");
		t2.start();
		System.out.println("Thread 2 : " + Thread.currentThread().getName());
		System.out.println("Thread id : " + t2.getId());
		

	}

}
