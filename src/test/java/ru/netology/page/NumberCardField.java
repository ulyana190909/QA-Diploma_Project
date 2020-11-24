package ru.netology.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NumberCardField {
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
    private final String cardNumberDeclined = FormOfPayment.getNumberCardDeclined();
    private final String cardNumberEmpty = FormOfPayment.getEmptyNumberCard();
    private final String cardNumberUncorrect = FormOfPayment.getUncorrectNumberCard();
    private final String monthCorrect = FormOfPayment.getCorrectMonthCard();
    private final String yearCorrect = FormOfPayment.getCorrectYearCard();
    private final String yearExpiredСard = FormOfPayment.getExpiredСardExpiryDate();
    private final String cvcCorrect = FormOfPayment.getCvcCorrect();
    private final String fewNumbersCard = FormOfPayment.getFewNumbersCard();

    //Методы для тестов формы "Купить"

    public void correctFieldApprovedCardBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void correctFieldDeclinedCardBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberDeclined);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectNumberCardFieldBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberUncorrect);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void emptyNumberCardFieldBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberEmpty);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void fewNumbersCardInFieldBuyForm() {
        buyField.click();
        numberCardField.setValue(fewNumbersCard);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    //Методы для тестов формы "Купить в кредит"

    public void correctFieldApprovedCardCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void correctFieldDeclinedCardCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberDeclined);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void uncorrectNumberCardFieldCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberUncorrect);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void emptyNumberCardFieldCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberEmpty);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void fewNumbersCardInFieldCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(fewNumbersCard);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }
}


