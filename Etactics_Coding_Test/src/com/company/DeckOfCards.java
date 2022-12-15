package com.company;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards
{
    private List<Card> deck;
    public DeckOfCards(List<Card> deck) {
        this.deck = deck;
    }

    public DeckOfCards()
    {
        List<String> suits = Card.getValidSuits();

        List<String> faceNames = Card.getValidFaceNames();

        List<Card> deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceName:faceNames) {
                deck.add(new Card(faceName, suit));
            }
        }
    }


}
