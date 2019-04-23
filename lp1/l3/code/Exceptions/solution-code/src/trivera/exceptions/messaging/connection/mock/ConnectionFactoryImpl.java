package trivera.exceptions.messaging.connection.mock;

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
public class ConnectionFactoryImpl implements ConnectionFactory {

	//CODE3:
	//The ConnectionFactory interface requires
	//the getConnection() method which throws IOException to be implemented	
	public MessagingConnection getConnection(String username, String password) throws IOException {

		if (username == null || "".equals(username.trim()) || username.length() < 4) {
			throw new IOException("Could not create connection (invalid username)");
		}

		MessagingConnectionImpl connection = new MessagingConnectionImpl(username);
		connection.initializeConnection();
		return connection;
	}

}
