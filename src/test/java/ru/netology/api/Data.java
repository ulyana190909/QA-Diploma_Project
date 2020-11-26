package ru.netology.api;

import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
public class Data {

    @Value
    public static class CardData {
        String numberCard;
        String month;
        String year;
        String owner;
        String cvc;
    }

    public static CardData getApprovedCard() {
        return new CardData("4444 4444 4444 4441", "01", "22", "Smirnova Larisa", "095");
    }

    public static CardData getDeclinedCard() {
        return new CardData("4444 4444 4444 4442", "12", "25", "Lolita Noskova", "102");
    }
}
