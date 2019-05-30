package trivera.jpa.client;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import trivera.jpa.reservation.model.Reservation;
import trivera.jpa.service.ReservationService;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC., Worldwide
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Technologies, Inc.
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 * 
 * @author The Trivera Tech Team.
 */
public class Application {

	public static void main(String[] args) {
		System.out.println("Exercise: JPA");
		System.out.println("Type: lab-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		Application application = new Application();
		application.test();

	}

	public void test() {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();

		try (SeContainer container = initializer.initialize();) {
			ReservationService service = container.select(ReservationService.class).get();
			makeReservations(service);
		}
	}

	private void makeReservations(ReservationService service) {
		System.out.println("*** Creating Reservations ***");
		int reservationID1 = service.addReservation("Ice Age", 2, LocalDate.now(), LocalTime.of(19, 05));

		int reservationID2 = service.addReservation("Guardians of the Galaxy", 4, LocalDate.now(), LocalTime.of(21, 15));
		int reservationID3 = service.addReservation("The Avengers", 2, LocalDate.now(), LocalTime.of(23, 45));

		System.out.printf("Reservation ID 1: %s%n", reservationID1);
		System.out.printf("Reservation ID 2: %s%n", reservationID2);
		System.out.printf("Reservation ID 3: %s%n", reservationID3);

		System.out.println("*** Get Reservation by ID ***");
		Reservation reservation = service.getReservation(reservationID1);
		System.out.println(reservation);
		System.out.println("*** Cancel Reservation by ID ***");
		service.cancelReservation(reservationID1);
		System.out.println("*** List all Reservations for today ***");
		List<Reservation> reservations = service.getReservations(LocalDate.now());
		reservations.forEach(System.out::println);
	}

}
