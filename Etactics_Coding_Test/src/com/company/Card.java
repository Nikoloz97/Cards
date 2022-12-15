package com.company;
import java.util.Arrays;
import java.util.List;

public class Card {
    // 1. Instance variables...
    private String faceName, suit;

    // 2. Constructors. Set methods = ensure we have a valid face name and suit
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    // 3. For each instance variable, create a "getter" and "setter"...

    // "Gets" an instance variable (faceName)
    public String getFaceName() {
        return faceName;
    }


    // Tip: whatever is GENERIC to the object you're creating (i.e. card) = use "static" return type (don't need to create an instance)
    // Whatever is UNIQUE to the object = DON'T use static

    // Prep for the setter...
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10","ace","king", "queen", "jack");
    }

    // "Sets" what arguments are valid (e.g. 2, 5, jack, queen, king)
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are:" + validFaceNames);
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit (String suit) {
        this.suit = suit;
    }



    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
    }

//    @Override
//    public String toString() {
//        return "Card{" +
//                "faceName='" + faceName + '\'' +
//                ", suit='" + suit + '\'' +
//                '}';
//    }
}
