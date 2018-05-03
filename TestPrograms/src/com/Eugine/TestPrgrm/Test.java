package com.Eugine.TestPrgrm;

public class Test implements Runnable {

	public void run(Thread t)
	{
	System.out.println("Running...");
	}
	public static void main(String [] args)
	{
	new Thread(new Test()).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
