package trivera.exceptions.messaging.connection;

import java.io.IOException;

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
public interface MessagingConnection extends AutoCloseable {

	/**
	 * Send a text message
	 * 
	 * @param message
	 *            The message to be send
	 * @throws IOException
	 *             thrown when message contents is invalid
	 */
	void sendMessage(String message) throws IOException;

	/**
	 * Close the connection
	 * 
	 * @throws IOException
	 *             thrown when connection can not be closed
	 */
	void close() throws IOException;
}
