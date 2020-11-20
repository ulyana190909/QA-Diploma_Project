package ru.netology.page;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Value;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;


public class FormOfPayment {
    public FormOfPayment() {
    }

//    @Value
//    public static class formOfPay {
//        private String numberCard;
//        private String month;
//        private String year;
//        private String owner;
//        private String cvc;
//    }

    @Value
    @AllArgsConstructor
    public static class UserData{
        String infoCard;
    }

    public static UserData getNumberCardApproved() {
        return new UserData ("4444444444444441");
    }
    public static UserData getNumberCardDeclined() {
        return new UserData("4444444444444442");
    }
    public static UserData getEmptyNumberCard(){
        return new UserData("");
    }
    public static UserData getUncorrectNumberCard() {
        return new UserData("4444444444445865");
    }

    public static UserData getEmptyMonthCard() {
        return new UserData("");
    }

    public static UserData getCorrectMonthCard() {
        List<String> list = Arrays.asList("01","02","03","04","05","06","07","08","09","10","11","12");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return new UserData(month);
    }

    public static UserData getUncorrectMonthCard() {
        List<String> list = Arrays.asList("13","14", "15","16","16","17","18","19","20","21","22","23");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return new UserData(month);
    }
    public static UserData getUncorrectMonthOneNumber() {
        List<String> list = Arrays.asList("0","1", "2","3","4","5","6","7","8","9");
        Random random = new Random();
        String month = list.get(random.nextInt(list.size()));
        return new UserData(month);
    }

    public static UserData getEmptyYearCard() {
        return new UserData("");
    }

    public static UserData getCorrectYearCard() {
        List<String> list = Arrays.asList("20","21", "22","23","24","25");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return new UserData(year);
    }

    public static UserData getUncorrectYearOneNumber() {
        List<String> list = Arrays.asList("0","1", "2","3","4","5","6","7","8","9");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return new UserData(year);
    }

    public static UserData getExpiredСardExpiryDate () {
        List<String> list = Arrays.asList("10","11", "12","13","14","15","16","17","18","19");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return new UserData(year);
    }

    public static UserData getUncorrectYearCard() {
        List<String> list = Arrays.asList("26","27", "28","29","30","31","32","33","34","35");
        Random random = new Random();
        String year = list.get(random.nextInt(list.size()));
        return new UserData(year);
    }

    public static UserData getOwnerRu(){
       Faker faker = new Faker(new Locale("ru"));
       String name = faker.name().fullName();
        return new UserData(name);
    }

    public static UserData getOwnerEn (){
        Faker faker = new Faker(new Locale("en"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return new UserData(name);
    }
    public static UserData getOwnerZh () {
        Faker faker = new Faker(new Locale("zh-CN"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return new UserData(name);
    }
    public static UserData getCvcCorrect() {
        return new UserData("985");
    }

    public static UserData getCvcEmpty() {
        return new UserData("");
    }
    public static UserData getCvcUncorrectOneNumber() {
        List<String> list = Arrays.asList("0","1", "2","3","4","5","6","7","8","9");
        Random random = new Random();
        String cvc = list.get(random.nextInt(list.size()));
        return new UserData(cvc);
    }
}


