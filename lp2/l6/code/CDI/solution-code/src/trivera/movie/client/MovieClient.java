package trivera.movie.client;

import java.util.List;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import trivera.movie.data.Movie;
import trivera.movie.service.MovieService;

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
public class MovieClient {

	private void searchMovies(String searchTitle) {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();

		try (SeContainer container = initializer.initialize()) {

			Instance<MovieService> service = container.select(MovieService.class);

			MovieService movieService = service.get();
			List<Movie> moviesByTitle = movieService.searchMoviesByTitle(searchTitle);
			moviesByTitle.forEach(System.out::println);
		}
	}

	public static void main(String[] args) {
		System.out.println("Exercise: CDI");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	
		disableWarning();

		MovieClient client = new MovieClient();
		client.searchMovies("Ice Age");
	}

	public static void disableWarning() {
		System.err.close();
		System.setErr(System.out);
	}	

}
	