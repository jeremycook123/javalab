package trivera.collections.simplegame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import trivera.collections.simplegame.model.Card;

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
public class CardGame {
	public enum Guess {
		HIGHER, LOWER
	}

	private List<Card> deck;
	private Card currentCard;

	/**
	 * Check if there are more cards available in the deck
	 * 
	 * @return true when the deck is not null and there are cards left in the deck
	 */
	public boolean hasMoreCards() {
		if (deck == null)
			return false;
		return deck.size() > 0;
	}

	/**
	 * Print all cards left on the deck to the console
	 */
	public void showDeck() {
		for (Card card : deck) {
			System.out.println(card);
		}
	}

	/**
	 * Setup a new Game
	 */
	public void createNewGame() {
		//CODE1:Create a Collection of Cards (The deck) and assign the reference to the deck instance variable
		deck = new LinkedList<>();

		//CODE2:Create a complete deck of Cards.
		Card[] cards = Card.getDeckOfCards();

		//CODE3:Fill the Collection (the deck) with the values from the Card array
		for (int i = 0; i < cards.length; i++) {
			deck.add(cards[i]);
		}

		//CODE4:Shuffle the Deck of Cards
		Collections.shuffle(deck);

		//CODE5:Get the first Card from the Collection and assign it to the currentCard instance variable
		currentCard = (Card) deck.get(0);
		
		//CODE6:Remove the current card from the deck
		deck.remove(currentCard);
	}

	/**
	 * Guess the next card in the Deck
	 * 
	 * @param guess
	 *            The guess
	 */
	public void guessNextCard(Guess guess) {
		//CODE7:Take the next card from the deck
		Card nextCard = (Card) deck.get(0);
		//CODE8:Remove the card from the deck
		deck.remove(nextCard);

		// Print out the Next card
		System.out.println("Next card is : " + nextCard);

		//CODE9:If the Guess is HIGHER
		if (guess == Guess.HIGHER) {
			// If the next card is Higher (use the isHigher method) print 'Right !', else
			// print 'wrong !'
			if (nextCard.isHigher(currentCard)) {
				System.out.println("*** Right ! ***");
			} else {
				System.out.println("*** Wrong !!! ***");
			}
		}
		
		//CODE10:If the Guess is LOWER
		if (guess == Guess.LOWER) {
			// If the next card is lower (use the isLower method) print 'Right !', else
			// print 'wrong !'
			if (nextCard.isLower(currentCard)) {
				System.out.println("*** Right ! ***");
			} else {
				System.out.println("*** Wrong !!! ***");
			}
		}

		//CODE11:Assign the Next card to the currentCard instance variable
		this.currentCard = nextCard;
	}

	/**
	 * Return the current Card
	 * 
	 * @return The current Card
	 */
	public Card getCurrentCard() {
		return currentCard;
	}
}
