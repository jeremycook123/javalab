package trivera.collections.movie.client;

import trivera.collections.movie.service.Movie;
import trivera.collections.movie.service.MovieService;

import java.util.List;

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
public class MovieClient {

    public static final String DREAMWORKS_STUDIO_NAME = "DreamWorks Animated";

	public static void main(java.lang.String[] args) {
		System.out.println("Exercise: UsingCollections");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));

        MovieService movieService = new MovieService();
    
        List<Movie> dreamWorksMovies = movieService.getMoviesByStudio(DREAMWORKS_STUDIO_NAME);

        for (Movie movie : dreamWorksMovies) {
            System.out.println(movie);
        }
	}
}
