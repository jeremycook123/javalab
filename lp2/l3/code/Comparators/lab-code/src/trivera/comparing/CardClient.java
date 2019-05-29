package trivera.comparing;

import java.util.Comparator;
import java.util.List;

import trivera.comparing.model.Card;

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
public class CardClient {

	public static void main(String[] args) {
		System.out.println("Exercise: Comparators");
		System.out.println("Type: lab-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		List<Card> deckOfCards = Card.getDeckOfCards();

		System.out.println("Sorted By Natural ordering");

		//CODE1:sort cards by natural ordering

		//CODE2:print out the sorted by natural ordered deck of cards

		System.out.println("Sorted using external comparator");

		//CODE3:create suit and number comparators

		//CODE4:create combined comparator to sort by suit and then number

		//CODE5:sort cards using custom combined comparator

		//CODE6:print out the custom combined ordered deck of cards

	}

}
