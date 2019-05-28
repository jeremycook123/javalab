package trivera.streams.collecting;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toList;
import static trivera.streams.data.MovieDataSource.getAllMovies;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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

	/**
	 * Create a Map instance, the key is the genre of the movie and the value is the
	 * number of movies in this Genre
	 * 
	 * @return a Map<String, Long> instance
	 */
	public Map<String, Long> getMovieCountByGenre() {
		//CODE1:Return movie count by genre
		Stream<Movie> movies = getAllMovies();

		return movies.collect(groupingBy(Movie::getGenre, counting()));
	}

	/**
	 * Returns pricing information. Average price, lowest price, highest price and
	 * the total value of our inventory.
	 * 
	 * @return DoubleSummaryStatistics
	 */
	public DoubleSummaryStatistics getPriceStatistics() {
		//CODE2:Return pricing information. Average price, lowest price, highest price and the total value of our inventory
		Stream<Movie> movies = getAllMovies();
		DoubleSummaryStatistics statistics = movies.collect(summarizingDouble(Movie::getPrice));
		return statistics;
	}

	/**
	 * Return a List of MovieInfo objects, containing only entries for Movies that
	 * are on sale !
	 * 
	 * @return List<MovieInfo>
	 */
	public List<MovieInfo> getOnSaleMovieInfo() {
		//CODE3:Return a List of MovieInfo objects, containing only entries for Movies that are on sale
		Stream<Movie> movies = getAllMovies();
		return movies.filter(Movie::isOnSale).map(movie -> new MovieInfo(movie.getTitle(), movie.getPrice())).collect(toList());
	}
}
