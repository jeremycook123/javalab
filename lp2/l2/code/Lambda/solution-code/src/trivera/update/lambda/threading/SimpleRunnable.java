package trivera.update.lambda.threading;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class SimpleRunnable {

	public static void main(java.lang.String[] args) {
		System.out.println("Exercise: Lambda.SimpleRunnable");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		//CODE3.1:Define custom runnable using lambda notation
		Runnable runnable = () -> {
			for (int a = 0; a < 100; a++) {
				System.out.println(Thread.currentThread().getName() + ": " + a);
				Thread.yield();
			}
		};

		//CODE3.2:Define 3 threads
		Thread t1 = new Thread(runnable, "Runnable 1");
		Thread t2 = new Thread(runnable, "Runnable 2");
		Thread t3 = new Thread(runnable, "Runnable 3");

		//CODE3.3:Start and run 3 threads
		t1.start();
		t2.start();
		t3.start();
	}
}
