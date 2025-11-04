package main.java.com.race.model;

import java.util.Objects;

public final class Card {

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        if (suit == null || rank == null) {
            throw new IllegalArgumentException("Suit and Rank cannot be null");
        }

        this.rank = rank;
        this.suit = suit;
    }

    public  Suit suit() {
        return suit;
    }

    public Rank rank() {
        return rank;
    }

    @Override
    public String toString() {
        return suit.symbol() + rank.openCard();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
