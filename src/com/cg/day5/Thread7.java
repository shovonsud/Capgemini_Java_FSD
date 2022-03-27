package com.cg.day5;

public class Thread7 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t.getName());

		// checks if current thread is alive
		System.out.println("Is Alive? " + t.isAlive());
	}

	public static void main(String args[]) throws Exception {
		Thread t = new Thread(new Thread7());
		t.start();

		// Waits for 1000ms this thread to die.
		t.join(1000);

		System.out.println("\nJoining after 1000" + " milliseconds: \n");
		System.out.println("Current thread: " + t.getName());

		// Checks if this thread is alive
		System.out.println("Is alive? " + t.isAlive());
	}

}
