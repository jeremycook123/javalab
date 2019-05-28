package trivera.comparing.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a card from a standard card deck.
 *
 * When the deck is constructed it will fill itself with the 52 cards in a
 * standard deck (no jokers!).
 *
 * While there are constants defined to represent the different suits and
 * values, they would probably never be used outside of the code that is already
 * written here.
 *
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies. This component and source code may be
 * used for instructional and evaluation purposes only. No part of this
 * component or its source code may be sold, transferred, or publicly posted,
 * nor may it be used in a commercial or production environment, without the
 * express written consent of Trivera Technologies.
 *
 * Copyright (c) 2002 Trivera Technologies.
 * </p>
 * 
 * @author Tech Team
 * @version 1.0
 *
 *
 */

public class Card implements Comparable<Card> {
	private Suit suit;
	private CardValue number;

	@Override
	public int compareTo(Card other) {
		if (other == null)
			return 1;

		if (this.number == null)
			return -1;

		return this.number.compareTo(other.getNumber());
	}

	/**
	 * Constructs the card.
	 *
	 * The suit and number value are verified to ensure they are in the correct
	 * range.
	 *
	 * @param suit
	 *            The card suit - HEARTS, SPADES, DIAMONDS, or CLUBS
	 * @param number
	 *            A value between DEUCE and ACE
	 * @throws IllegalArgumentException
	 *             If a value is provided that is outside the valid range.
	 */
	public Card(Suit suit, CardValue number) {
		super();

		this.suit = suit;
		this.number = number;
	}

	/**
	 * Compares this card to another card to see if they are the same.
	 *
	 * A card is considered equal to another card if the suit and number are the
	 * same.
	 *
	 * @return boolean
	 * @param other
	 *            The other card to compare with
	 */
	public boolean equals(Object other) {

		if (!(other instanceof Card))
			return false;

		Card otherCard = (Card) other;

		return this.getSuit() == otherCard.getSuit() && this.getNumber() == otherCard.getNumber();
	}

	/**
	 * Returns the number of the card.
	 *
	 * @return The number of this card
	 */
	public CardValue getNumber() {
		return number;
	}

	/**
	 * Returns the card's suit.
	 *
	 * The suit values are represented by constants in this class.
	 *
	 * @return The suit of this card
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * Returns a String that represents the value of this card.
	 * 
	 * @return a string representation of the card
	 */
	public String toString() {
		return String.format("%s of %s", number, suit);
	}

	public boolean isHigher(Card other) {
		if (other == null)
			return true;

		return number.isMore(other.getNumber());
	}

	public boolean isLower(Card other) {
		if (other == null)
			return true;

		return number.isLess(other.getNumber());
	}

	/**
	 * Aquire a List of Cards which holds a complete Deck of Cards
	 * 
	 * @return
	 */
	public static List<Card> getDeckOfCards() {
		List<Card> deck = new ArrayList<>();
		
		// Create the cards for each of the four suits.
		for (Suit suit : Suit.values()) {
			for (CardValue value : CardValue.values()) {
				deck.add(new Card(suit, value));
			}
		}

		Collections.shuffle(deck);

		return deck;
	}

}
