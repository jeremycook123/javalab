package trivera.jdbc;

import java.util.List;

import trivera.jdbc.impl.MovieDAOImpl;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera
 * Technologies
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
public class Client {

	public static void main(String[] args) {
		System.out.println("Exercise: JDBC");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		//CODE4:Get an instance of MovieDAO
		MovieDAO dao = new MovieDAOImpl();

		//CODE5:Request movie data from the database and print to console
		List<Movie> moviesByRating = dao.getMoviesByRating("PG");
		System.out.printf("Found %d movies%n", moviesByRating.size());
		moviesByRating.forEach(System.out::println);

	}

}
