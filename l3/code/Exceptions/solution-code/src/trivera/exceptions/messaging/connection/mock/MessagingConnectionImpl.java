package trivera.exceptions.messaging.connection.mock;

import java.io.IOException;
import java.time.LocalDateTime;

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
public class MessagingConnectionImpl implements MessagingConnection {

	private String username;
	private boolean connectionOpen;

	protected MessagingConnectionImpl(String username) {
		this.username = username;
	}

	//CODE1:
	//The MessagingConnection interface requires
	//the close() method which throws IOException to be implemented
	@Override
	public void close() throws IOException {
		connectionOpen = false;
	}

	//CODE2:
	//The MessagingConnection interface requires
	//the sendMessage() method which throws IOException to be implemented	
	@Override
	public void sendMessage(String message) throws IOException {
		if (message == null || "".equals(message.trim()) || message.contains(".NET")) {
			throw new IOException("Could not send message (invalid message format)");
		}
		System.out.printf("%1$s (%2$tD %2$tR) : %3$s%n", username, LocalDateTime.now(), message);
	}

	protected void initializeConnection() {
		connectionOpen = true;

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if (connectionOpen) {
					System.err.println("Possible resource leak, Connection still open!");
				}
			}
		});
	}
}
