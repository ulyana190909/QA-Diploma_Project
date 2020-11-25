package ru.netology.page;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Value
@AllArgsConstructor
public class FormOfPayment {
    public static Faker faker = new Faker();

    public static String getNumberCardApproved() {
        String numberCardApproved = "4444 4444 4444 4441";
        return numberCardApproved;
    }

    public static String getNumberCardDeclined() {
        String numberCardDeclined = "4444 4444 4444 4442";
        return numberCardDeclined;
    }

    public static String getEmptyNumberCard() {
        String emptyNumberCard = "";
        return emptyNumberCard;
    }

    public static String getUncorrectNumberCard() {
        String uncorrectNumber = "4444 4444 4444 5865";
        return uncorrectNumber;
    }

    public static String getFewNumbersCard() {
        String fewNumber = "4444 4444 4444 44";
        return fewNumber;
    }

    public static String getEmptyMonthCard() {
        String emptyMonth = "";
        return emptyMonth;
    }

    public static String getCorrectMonthCard() {
        List<String> list = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return month;
    }

    public static String getUncorrectMonthCard() {
        List<String> list = Arrays.asList("13", "14", "15", "16", "16", "17", "18", "19", "20", "21", "22", "23");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return month;
    }
    public static String getThisMonth(){
        String thisMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("MM"));
        return thisMonth;
    }

    public static String getThisYear(){
        String thisYear = LocalDate.now().format(DateTimeFormatter.ofPattern("YY"));
        return thisYear;
    }

    public static String getUncorrectMonthOneNumber() {
        String month = faker.random().hex(1);
        return month;
    }

    public static String  getEmptyYearCard() {
        String emptyYear = "";
        return emptyYear;
    }

    public static String  getCorrectYearCard() {
        List<String> list = Arrays.asList("21", "22", "23", "24", "25");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return year;
    }

    public static String getUncorrectYearOneNumber() {
        String year = faker.random().hex(1);
        return year;
    }

    public static String  getExpiredСardExpiryDate() {
        List<String> list = Arrays.asList("10", "11", "12", "13", "14", "15", "16", "17", "18", "19");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return year;
    }

    public static String getUncorrectYearCard() {
        List<String> list = Arrays.asList("26", "27", "28", "29", "30", "31", "32", "33", "34", "35");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return year;
    }

    public static String getOwnerRu() {
        Faker faker = new Faker(new Locale("ru"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public static String getOwnerEn() {
        Faker faker = new Faker(new Locale("en"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public static String getOwnerZh() {
        Faker faker = new Faker(new Locale("zh-CN"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public static String getEmptyOwner() {
        String emptyOwner = "";
        return emptyOwner;
    }

    public static String getNumbersInFieldOwner() {
        String number = "4444 4444 4444 4441";
        return number;
    }

    public static String  getOneLetterInFieldOwner() {
        String oneLetter = "Л";
        return oneLetter;
    }

    public static String getManyLettersInFieldOwner() {
        String manyLetter = "ЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛ";
        return manyLetter;
    }

    public static String getOwnerWithDoubleSurname() {
        String doubleSurname = "Ramzina-Novikova Sofia";
        return doubleSurname;
    }

    public static String getOwnerWithNumbersPunctuationMarks() {
        String ownerWithPunctuationMarks = "yusypova margarita/.=61";
        return ownerWithPunctuationMarks;
    }

    public static String getOwnerWithManySpace() {
        String ownerWithManySpace = "loponov     fillip ";
        return ownerWithManySpace;
    }

    public static String getCvcCorrect() {
        String cvcCorrect = faker.number().digits(3);
        return cvcCorrect;
    }

    public static String getCvcEmpty() {
        String cvcEmpty = "";
        return cvcEmpty;
    }

    public static String getCvcUncorrectOneNumber() {
        String cvc = faker.random().hex(1);
        return cvc;
    }
}


