package com.cg.day5;

class ThreadA extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total += i;
			}
			notify();
		}
	}
}

public class Thread8 {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();

		synchronized (a) {
			try {
				System.out.println("Waiting for a to complete...");
				a.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Total is: " + a.total);
		}
	}

}
