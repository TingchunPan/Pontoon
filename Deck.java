//Tingchun Pan 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import com.bham.pij.assignments.pontoon.Card.Suit;
import com.bham.pij.assignments.pontoon.Card.Value;

public class Deck {
	private ArrayList<Card> deckOfCards;

	public Deck() {
		deckOfCards = new ArrayList<>();
		for (Suit cardSuit : Suit.values()) {
			for (Value cardValue : Value.values()) {
				deckOfCards.add(new Card(cardSuit, cardValue));
			}
		}

	}

	public void reset() {
		deckOfCards.clear();
		for (Suit cardSuit : Suit.values()) {
			for (Value cardValue : Value.values()) {
				deckOfCards.add(new Card(cardSuit, cardValue));
			}
		}

	}

	public void shuffle() {
		ArrayList<Integer> deckOfCards = new ArrayList<Integer>();
		for (int i = 0; i < deckOfCards.size(); ++i) {
			deckOfCards.add(i);
		}
		Collections.shuffle(deckOfCards);

	}

	public Card getCard(int i) {
		return deckOfCards.get(i);
	}

	public Card dealRandomCard() {
		int random = (int) (Math.random() * deckOfCards.size())+1;
		Card card = deckOfCards.get(random);
		deckOfCards.remove(random);
		return card;
	}

	public int size() {
		return deckOfCards.size();
	}
}
