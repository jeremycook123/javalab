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

	//CODE4:
	//Implement a private void close(MessagingConnection connection)
	//which attempts to close the connection inside a try-catch block
	//to handle potential IOException if thrown

	//CODE5:
	//Implement a public void sendMessage(String username, String password, String message)
	//which calls the ConnectionFactory to get a new MessagingConnection.
	//The sendMessage method is then called on the new MessagingConnection,
	//inside a try-catch-finally block to handle potential IOException if thrown
}
