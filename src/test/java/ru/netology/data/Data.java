package ru.netology.data;

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

    public static CardData getCorrectlyCompletedApprovedCardForm() {
        return new CardData("4444 4444 4444 4441", "10", "23", "LOMAKIN MIKHAIL", "899");
    }

    public static CardData getCorrectlyCompletedDeclinedCardForm() {
        return new CardData("4444 4444 4444 4442", "11", "24", "PETROV BORIS", "145");
    }

    public static CardData getFormWithAllEmptyFields() {
        return new CardData("", "", "", "", "");
    }

    //For Number Card Field

    public static CardData getFormWithEmptyFieldNumberCard() {
        return new CardData("", "05", "22", "PETROVA OLGA", "125");
    }

    public static CardData getFormWithIncorrectNumberCard() {
        return new CardData("4444 4444 4444 5865", "09", "21", "CYCOEVA ADELINA", "856");
    }

    public static CardData getFormWithDeficientNumberCard() {
        return new CardData("4444 4444 4444 44", "12", "21", "KARAMZIN VLADIMIR", "885");
    }

    //For Month Field

    public static CardData getFormWithEmptyFieldMonth() {
        return new CardData("4444 4444 4444 4441", "", "21", "ARINA NUPIVA", "562");
    }

    public static CardData getFormWithIncorrectFieldMonthZero() {
        return new CardData("4444 4444 4444 4441", "00", "23", "LORA MAMAEVA", "857");
    }

    public static CardData getFormWithInvalidMonth() {
        return new CardData("4444 4444 4444 4441", "15", "21", "OLGA MATVEEVA", "562");
    }

    public static CardData getFormWithCurrentDate() {
        return new CardData("4444 4444 4444 4441", "12", "20", "Smirnova Larisa", "195");
    }

    public static CardData getFormWithIncorrectFieldMonthOneNumber() {
        return new CardData("4444 4444 4444 4441", "8", "21", "OLEG POPOV", "710");
    }

    //For Year Field

    public static CardData getFormWithEmptyYear() {
        return new CardData("4444 4444 4444 4441", "12", "", "STEPAN MUH", "041");
    }

    public static CardData getFormWithIncorrectFieldYearOneNumber() {
        return new CardData("4444 4444 4444 4441", "12", "2", "MAMAEVA ZINA", "078");
    }

    public static CardData getFormWithExpiredYear() {
        return new CardData("4444 4444 4444 4441", "10", "19", "MIROSLAVA ANTONOVA", "700");
    }

    public static CardData getFormWithInvalidYear() {
        return new CardData("4444 4444 4444 4441", "10", "29", "ELIZAVETA MOROZOVA", "168");
    }

    //For Holder Field

    public static CardData getFormWithHolderRu() {
        return new CardData("4444 4444 4444 4441", "11", "21", "ЛОЛИТА ВЕРСНАНОВА", "152");
    }

    public static CardData getFormWithHolderZh() {
        return new CardData("4444 4444 4444 4441", "10", "23", "玉林 刘", "899");
    }

    public static CardData getFormWithEmptyFieldHolder() {
        return new CardData("4444 4444 4444 4441", "09", "25", "", "589");
    }

    public static CardData getFormWithNumbersInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "01", "24", "4444 4444 4444 4441", "999");
    }

    public static CardData getFormWithShortNameInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "08", "24", "Л", "985");
    }

    public static CardData getFormWithLongNameInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "12", "21", "ЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛ", "127");
    }

    public static CardData getFormWithDoubleSurnameInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "08", "22", "Ramzina-Novikova Sofia", "899");
    }

    public static CardData getFormWithNumbersAndPunctuationMarksInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "02", "23", "yusypova margarita/.=61", "030");
    }

    public static CardData getFormWithManySpaceInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "01", "24", "loponov     fillip", "999");
    }

    //For CVC Field

    public static CardData getFormWithEmptyFieldCvc() {
        return new CardData("4444 4444 4444 4441", "01", "24", "SIDOROV PETR", "");
    }

    public static CardData getFormWithIncorrectCvc() {
        return new CardData("4444 4444 4444 4441", "11", "23", "BOGOMAZOVA MARIIA", "5");
    }
}

