package trivera.collections.simplegame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * Starts the card game.
 * </p>
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
public class RunGame {

	public static void main(java.lang.String[] args) {
		System.out.println("Exercise: SimpleGame");
		System.out.println("Type: lab-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		CardGame cardGame = new CardGame();
		cardGame.createNewGame();
		System.out.println("Welcome to this Simple Card Came");
		System.out.println("--------------------------------------");
		String cmd;
		// Creates the reader to read lines from standard input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (cardGame.hasMoreCards()) {

			System.out.print("The value of the current Card is : ");

			// Display the value of the First Card
			System.out.println(cardGame.getCurrentCard());

			System.out.println("Choose");
			System.out.println("1 - The next Card will have a Higher value");
			System.out.println("2 - The next Card will have a Lower value");
			System.out.println("3 - Start New Game");
			System.out.println("4 - Show remaining Cards");
			System.out.println("9 - Exit game");

			try {
				cmd = reader.readLine();
			} catch (IOException ioe) {
				return;
			}

			System.out.println("");

			if (cmd.startsWith("9")) {
				System.exit(0);
			}

			if (cmd.startsWith("1")) {
				cardGame.guessNextCard(CardGame.Guess.HIGHER);
			} else if (cmd.startsWith("2")) {
				cardGame.guessNextCard(CardGame.Guess.LOWER);
			} else if (cmd.startsWith("3")) {
				cardGame.createNewGame();
			} else if (cmd.startsWith("4")) {
				cardGame.showDeck();
			} else {
				System.out.println("Unknown input");
			}

			System.out.println("--------------------------------------");
		}

	}

}
