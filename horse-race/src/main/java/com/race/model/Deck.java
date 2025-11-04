package main.java.com.race.model;

import java.util.*;

public final class Deck {
    private final List<Card> cards;
    private int currentIndex;

    private Deck() {
        this.cards = new ArrayList<>();
        this.currentIndex = 0;
    }

    public static Deck standard52() {
        Deck deck = new Deck();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.cards.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public void shuffle(Random rng) {
        if (rng == null) {
            throw new IllegalArgumentException("Random cannot be null");
        }
        Collections.shuffle(cards, rng);
        currentIndex = 0;
    }

    public Card draw() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deck이 비었어 !");
        }
        return cards.get(currentIndex++);
    }

    public boolean isEmpty() {
        return currentIndex >= cards.size();
    }

    public int remaining() {
        return cards.size() - currentIndex;
    }
}
