package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

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


    public static Faker faker = new Faker();

    public String getNumberCardApproved() {
        String numberCardApproved = "4444 4444 4444 4441";
        return numberCardApproved;
    }

    public String getNumberCardDeclined() {
        String numberCardDeclined = "4444 4444 4444 4442";
        return numberCardDeclined;
    }

    public String getEmptyNumberCard() {
        String emptyNumberCard = "";
        return emptyNumberCard;
    }

    public String getUncorrectNumberCard() {
        String uncorrectNumber = "4444 4444 4444 5865";
        return uncorrectNumber;
    }

    public String getFewNumbersCard() {
        String fewNumber = "4444 4444 4444 44";
        return fewNumber;
    }

    public String getEmptyMonthCard() {
        String emptyMonth = "";
        return emptyMonth;
    }

    public String getCorrectMonthCard() {
        List<String> list = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return month;
    }

    public String getIncorrectZeroMonth() {
        String monthZero = "00";
        return monthZero;
    }

    public String getUncorrectMonthCard() {
        List<String> list = Arrays.asList("13", "14", "15", "16", "16", "17", "18", "19", "20", "21", "22", "23");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return month;
    }

    public String getThisMonth() {
        String thisMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("MM"));
        return thisMonth;
    }

    public String getThisYear() {
        String thisYear = LocalDate.now().format(DateTimeFormatter.ofPattern("YY"));
        return thisYear;
    }

    public String getUncorrectMonthOneNumber() {
        String month = faker.random().hex(1);
        return month;
    }

    public String getEmptyYearCard() {
        String emptyYear = "";
        return emptyYear;
    }

    public String getCorrectYearCard() {
        List<String> list = Arrays.asList("21", "22", "23", "24", "25");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return year;
    }

    public String getUncorrectYearOneNumber() {
        String year = faker.random().hex(1);
        return year;
    }

    public String getExpiredСardExpiryDate() {
        List<String> list = Arrays.asList("10", "11", "12", "13", "14", "15", "16", "17", "18", "19");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return year;
    }

    public String getUncorrectYearCard() {
        List<String> list = Arrays.asList("26", "27", "28", "29", "30", "31", "32", "33", "34", "35");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return year;
    }

    public String getOwnerRu() {
        Faker faker = new Faker(new Locale("ru"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public String getOwnerEn() {
        Faker faker = new Faker(new Locale("en"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public String getOwnerZh() {
        Faker faker = new Faker(new Locale("zh-CN"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public String getEmptyOwner() {
        String emptyOwner = "";
        return emptyOwner;
    }

    public String getNumbersInFieldOwner() {
        String number = "4444 4444 4444 4441";
        return number;
    }

    public String getOneLetterInFieldOwner() {
        String oneLetter = "Л";
        return oneLetter;
    }

    public String getManyLettersInFieldOwner() {
        String manyLetter = "ЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛ";
        return manyLetter;
    }

    public String getOwnerWithDoubleSurname() {
        String doubleSurname = "Ramzina-Novikova Sofia";
        return doubleSurname;
    }

    public String getOwnerWithNumbersPunctuationMarks() {
        String ownerWithPunctuationMarks = "yusypova margarita/.=61";
        return ownerWithPunctuationMarks;
    }

    public String getOwnerWithManySpace() {
        String ownerWithManySpace = "loponov     fillip ";
        return ownerWithManySpace;
    }

    public String getCvcCorrect() {
        String cvcCorrect = "980";
        return cvcCorrect;
    }

    public String getCvcEmpty() {
        String cvcEmpty = "";
        return cvcEmpty;
    }

    public String getCvcUncorrectOneNumber() {
        String cvc = faker.random().hex(1);
        return cvc;
    }
}


