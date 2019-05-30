package trivera.jpa.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import trivera.jpa.reservation.model.Reservation;

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
public interface ReservationService {
	int addReservation(String title, int numberOfSeats, LocalDate date, LocalTime time);

	Reservation getReservation(int reservationID);

	List<Reservation> getReservations(LocalDate date);

	void cancelReservation(int reservationID);
}
