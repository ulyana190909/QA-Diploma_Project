package ru.netology.api;

import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
public class Data {

    @Value
    public static class CardData {
        String number;
        String month;
        String year;
        String holder;
        String cvc;
    }

    public static CardData getApprovedCard() {
        return new CardData("4444 4444 4444 4441", "11", "22", "Smirnova Larisa", "195");
    }

    public static CardData getDeclinedCard() {
        return new CardData("4444 4444 4444 4442", "11", "22", "Smirnova Larisa", "195");
    }
}
