package trivera.collections.movie.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import trivera.collection.movie.data.MovieDataSource;

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
public class MovieService {

	private MovieDataSource movieDataSource = null;

	public MovieService() {
		movieDataSource = MovieDataSource.getInstance();
	}

	/**
	 * Returns a Set of Studios present in this DataSource
	 * 
	 * @return A Set of String objects
	 */
	public Set<String> getStudios() {
		//CODE1:Return a Set of Studios present in this DataSource
	}

	/**
	 * Get all Movies of a single Studio
	 * 
	 * @param studio
	 *            The name of the movie studio
	 * @return A List of zero or more movies. (Empty list is returned when
	 *         studio is not found)
	 */
	public List<Movie> getMoviesByStudio(String studio) {
		//CODE2:Return a List of zero or more movies. Empty list is returned when studio is not found
	}

	/**
	 * When the Map does not yet contain a mapping for the given studio, add a
	 * mapping for the studio (adding an empty list)
	 * 
	 * @param studio
	 *            The Studio to 'add'
	 * @return The List of movies for this studio
	 */
	public List<Movie> addStudioIfAbsent(String studio) {
		//CODE3:Return a List of movies for this studio
	}

	/**
	 * Get all available movies
	 * 
	 * List is sorted By Studio first, and by title second
	 * 
	 * @return A SORTED list of all movies
	 */
	public List<Movie> getAllMovies() {
		//CODE4:Return a custom SORTED list of all movies
	}

	/**
	 * Returns a Map where the Key is the studio name and the value is the
	 * number of movies released by this studio
	 * 
	 * @return A Map of String/Integer pairs
	 */
	public Map<String, Integer> getNumberOfMoviesByStudio() {
		//CODE5:Return a Map where the Key is the studio name and the value is the number of movies released by this studio
	}

}
