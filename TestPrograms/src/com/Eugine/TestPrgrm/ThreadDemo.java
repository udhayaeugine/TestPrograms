package com.Eugine.TestPrgrm;

public class ThreadDemo extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e){
				System.out.println("Thread Catch :"+e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		
		t1.run();
		t2.run();
		
	}

}
