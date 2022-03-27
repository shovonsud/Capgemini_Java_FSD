package com.cg.day5;

public class Thread4 implements Runnable {

	@Override
	public void run() {
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread thread1 = new Thread();
		thread1.start();
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1.setPriority(1);
		int priority = thread1.getPriority();
		System.out.println(priority);
		System.out.println("Thread Running");
	}

}
