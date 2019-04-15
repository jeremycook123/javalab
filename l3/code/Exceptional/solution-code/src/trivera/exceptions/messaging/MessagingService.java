package trivera.exceptions.messaging;

import java.io.IOException;

import trivera.exceptions.messaging.connection.ConnectionFactory;
import trivera.exceptions.messaging.connection.MessagingConnection;

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
public class MessagingService {

	public void sendMessage(String username, String password, String message) throws InvalidUsernameException {

		if (username == null || username.trim().length() < 4) {
			throw new InvalidUsernameException("Invalid username", username);
		}

		try (MessagingConnection connection = ConnectionFactory.getConnection("Fred", "123");) {

			connection.sendMessage(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
