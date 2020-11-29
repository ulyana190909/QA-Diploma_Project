package ru.netology.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class YearField {
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
    private final String yearCorrect = FormOfPayment.getCorrectYearCard();
    private final String yearUncorrect = FormOfPayment.getUncorrectYearCard();
    private final String yearEmpty = FormOfPayment.getEmptyYearCard();
    private final String yearExpiredСard = FormOfPayment.getExpiredСardExpiryDate();
    private final String cvcCorrect = FormOfPayment.getCvcCorrect();
    private final String yearUncorrectOneNumber = FormOfPayment.getUncorrectYearOneNumber();

    //Методы для тестов формы "Купить"

    public void correctYearBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectFieldYearBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearUncorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void oneNumberInYearBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearUncorrectOneNumber));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void emptyFieldYearBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(yearEmpty);
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void yearExpiredCardBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearExpiredСard));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    //Методы для тестов формы "Купить в кредит"

    public void correctYearCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectFieldYearCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearUncorrect));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void oneNumberInYearCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearUncorrectOneNumber));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void emptyFieldYearCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(yearEmpty);
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }

    public void yearExpiredCardCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearExpiredСard));
        ownerField.setValue(ownerInRus);
        cvcField.setValue(cvcCorrect);
    }
}
