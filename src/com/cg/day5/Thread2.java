package com.cg.day5;

public class Thread2 extends Thread {

	public Thread2(String nameString) {
		super(nameString);
	}

	@Override
	public void run() {
		System.out.println("MyThread - START " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			// Get database connection, delete unused data from DB
			doDBProcessing();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread - END " + Thread.currentThread().getName());
	}

	private void doDBProcessing() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Thread2 objThread2 = new Thread2("LOL");
		objThread2.run();

	}

}
