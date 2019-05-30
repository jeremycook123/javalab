package trivera.jpa.reservation.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
//CODE1:Annotate class with @Entity and @Table annotations to configure persistence
@Entity
@Table(name = "T001_RESERVATION")
public class Reservation {

	//CODE2:Annotate with @Id and @GeneratedValue to configure primary key
	@Id
	@GeneratedValue
	private Integer reservationId;
	private String movieTitle;
	private int numberOfSeats;
	private LocalDate date;


	//CODE3:Annotate with @Column annotation to specify the mapped table column  
	@Column(name = "TIME")
	private LocalTime startTime;

	public Integer getReservationId() {
		return reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation ID=").append(reservationId);
		sb.append(" Title=").append(movieTitle);
		sb.append(" Number Of Seats=").append(numberOfSeats);
		sb.append(" Date=").append(date);
		sb.append(" Time=").append(startTime);
		return sb.toString();
	}
}
