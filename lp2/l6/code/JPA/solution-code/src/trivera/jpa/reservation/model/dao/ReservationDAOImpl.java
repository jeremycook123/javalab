package trivera.jpa.reservation.model.dao;

import java.time.LocalDate;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
public class ReservationDAOImpl implements ReservationDAO {
	public static final String JP_QL_SELECT = "Select r from Reservation r where r.date = :date";
	@Inject
	private EntityManager entityManager;

	public Integer addReservation(Reservation reservation) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(reservation);
		transaction.commit();
		return reservation.getReservationId();
	}

	public Reservation getReservation(int reservationID) {
		Reservation reservation = entityManager.find(Reservation.class, reservationID);
		return reservation;
	}

	@SuppressWarnings("unchecked")
	public List<Reservation> getReservations(LocalDate date) {
		Query query = entityManager.createQuery(JP_QL_SELECT);
		query.setParameter("date", date);
		return query.getResultList();
	}

	public void cancelReservation(int reservationID) {
		Reservation reservation = entityManager.find(Reservation.class, reservationID);

		if (reservation != null) {
			entityManager.remove(reservation);
		}

	}

}
