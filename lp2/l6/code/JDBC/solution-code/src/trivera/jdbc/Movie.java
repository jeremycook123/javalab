package trivera.jdbc;

import java.time.LocalDate;

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
public class Movie {
	private Integer id;
	private String title;
	private String studio;
	private Double price;
	private String rating;
	private String genre;
	private LocalDate releaseDate;

	public String toString() {
		return String.format("Movie: id=%d, title=%s, studio=%s, price=%.2f, rating=%s, genre=%s, releaseDate=%s%n", id,
				title, studio, price, rating, genre, releaseDate);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isOnSale() {
		return price < 3;
	}

}
