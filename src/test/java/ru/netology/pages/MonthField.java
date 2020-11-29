package ru.netology.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MonthField {
    private final SelenideElement buyField = $(withText("Купить"));
    private final SelenideElement buyOnCreditField = $(withText("Купить в кредит"));
    private final SelenideElement numberCardField = $("input[placeholder='0000 0000 0000 0000']");
    private final SelenideElement monthField = $("input[placeholder='08']");
    private final SelenideElement yearField = $("input[placeholder='22']");
    private final ElementsCollection fieldSet = $$(".input__control");
    private final SelenideElement ownerField = fieldSet.get(3);
    private final SelenideElement cvcField = $("input[placeholder='999']");

    private final String ownerInRus = FormOfPayment.getOwnerRu();
    private final String cardNumberApproved = FormOfPayment.getNumberCardApproved();
    private final String monthCorrect = FormOfPayment.getCorrectMonthCard();
    private final String monthUncorrect = FormOfPayment.getUncorrectMonthCard();
    private final String monthUncorrectOneNumber = FormOfPayment.getUncorrectMonthOneNumber();
    private final String monthEmpty = FormOfPayment.getEmptyMonthCard();
    private final String yearCorrect = FormOfPayment.getCorrectYearCard();
    private final String cvcCorrect = FormOfPayment.getCvcCorrect();
    private final String thisMonth = FormOfPayment.getThisMonth();
    private final String thisYear = FormOfPayment.getThisYear();
    private final String zeroMonth = FormOfPayment.getIncorrectZeroMonth();

    //Методы для тестов формы "Купить"

    public void correctMonthBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectZeroMonthBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(zeroMonth));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectFieldMonthBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthUncorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void oneNumberInMonthFieldBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthUncorrectOneNumber));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void emptyFieldMonthBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(monthEmpty);
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void currentMonthOfTheCardBuyForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(thisMonth);
        yearField.setValue(thisYear);
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    //Методы для тестов формы "Купить в кредит"

    public void correctMonthCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectZeroMonthCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(zeroMonth);
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectFieldMonthCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthUncorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void oneNumberInMonthFieldCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthUncorrectOneNumber));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void emptyFieldMonthCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(monthEmpty);
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void currentMonthOfTheCardCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(thisMonth);
        yearField.setValue(thisYear);
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }
}
