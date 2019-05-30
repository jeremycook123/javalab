package trivera.jdbc.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trivera.jdbc.Movie;
import trivera.jdbc.MovieDAO;

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
public class MovieDAOImpl implements MovieDAO {
	//CODE1:Configure database connection details
	public static final String DB_URL = "jdbc:derby://localhost:50505/MovieDB";

	//CODE2:Configure parameterized SQL select statement 
	public static final String SELECT_BY_RATING_SQL = "SELECT MOVIE_ID, MOVIE_TITLE,STUDIO, PRICE, RATING, GENRE, RELEASE_DATE FROM MOVIES WHERE RATING=?";

	//CODE3:Create the getMoviesByRating method
	@Override
	public List<Movie> getMoviesByRating(String searchRating) {

		List<Movie> moviesFound = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection(DB_URL);
				PreparedStatement preparedStatement = connection.prepareCall(SELECT_BY_RATING_SQL)) {

			preparedStatement.setString(1, searchRating);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int movieID = resultSet.getInt("MOVIE_ID");
				String movieTitle = resultSet.getString("MOVIE_TITLE");
				String studio = resultSet.getString("STUDIO");
				double price = resultSet.getDouble("PRICE");
				String rating = resultSet.getString("RATING");
				String genre = resultSet.getString("GENRE");
				java.sql.Date releaseDate = resultSet.getDate("RELEASE_DATE");

				Movie movie = new Movie();
				movie.setId(movieID);
				movie.setTitle(movieTitle);
				movie.setStudio(studio);
				movie.setPrice(price);
				movie.setRating(rating);
				movie.setGenre(genre);
				movie.setReleaseDate(releaseDate.toLocalDate());
				moviesFound.add(movie);
			}

		} catch (SQLException sqle) {
			System.err.println("DB Error ");
			sqle.printStackTrace();
		}
		return moviesFound;
	}

}
