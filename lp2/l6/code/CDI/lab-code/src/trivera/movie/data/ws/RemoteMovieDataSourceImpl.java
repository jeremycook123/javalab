package trivera.movie.data.ws;

import java.util.Collections;
import java.util.List;

import trivera.movie.data.Movie;
import trivera.movie.data.MovieDataSource;

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

public class RemoteMovieDataSourceImpl implements MovieDataSource {

	@Override
	public List<Movie> getAllMoviesByTitle(String movieTitle) {
		System.out.println("Using Web Service");
		Movie dummy = new Movie();
		dummy.setTitle("Dummy");
		return Collections.singletonList(dummy);
	}

}
