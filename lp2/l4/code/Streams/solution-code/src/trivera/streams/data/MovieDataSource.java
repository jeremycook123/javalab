package trivera.streams.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import trivera.streams.Movie;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera
 * Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of Trivera
 * Technologies, LLC
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class MovieDataSource {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

	private static List<Movie> movieData;

	public static Stream<Movie> getAllMovies() {

		if (movieData != null)
			return movieData.stream();

		try (Stream<String> stream = new BufferedReader(
				new InputStreamReader(MovieDataSource.class.getResourceAsStream("movies.dat"))).lines();) {
			movieData = stream.map(line -> createObject(line)).collect(Collectors.toList());
		}

		return movieData.stream();
	}

	private static Movie createObject(String data) {
		String[] fields = data.split(";");
		Movie movie = new Movie();
		movie.setId(Integer.parseInt(fields[0]));
		movie.setTitle(fields[1]);
		movie.setStudio(fields[2]);
		movie.setPrice(Double.parseDouble(fields[3]));
		movie.setRating(fields[4]);
		movie.setGenre(fields[5]);

		try {
			movie.setReleaseDate(LocalDate.parse(fields[6], formatter));
		} catch (DateTimeParseException e) {
			// ignore
		}

		return movie;

	}

	private MovieDataSource() {
	}
}
