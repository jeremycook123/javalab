package trivera.annotations;

import trivera.annotations.writer.WriterService;

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
 * Copyright (c) 2019 Trivera Technologies, LLC http://www.triveratech.com
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class Application {

	public static void main(String[] args) {
		System.out.println("Exercise: Annotations");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		Employee emp1 = new Employee("1", "Jeremy");
		Employee emp2 = new Employee("2", "Fred");

		//CODE7:Call the WriterService to persist the Employee objects to disk
		WriterService service = new WriterService();
		service.writeObject(emp1);
		service.writeObject(emp2);
	}

}
