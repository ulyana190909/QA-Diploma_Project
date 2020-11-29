package ru.netology.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CvcField {
    private final SelenideElement buyField = $(withText("Купить"));
    private final SelenideElement buyOnCreditField = $(withText("Купить в кредит"));

    private final SelenideElement numberCardField = $("input[placeholder='0000 0000 0000 0000']");
    private final SelenideElement monthField = $("input[placeholder='08']");
    private final SelenideElement yearField = $("input[placeholder='22']");
    private final ElementsCollection fieldSet = $$(".input__control");
    private final SelenideElement ownerField = fieldSet.get(3);
    private final SelenideElement cvcField = $("input[placeholder='999']");

    private final String ownerInEng = FormOfPayment.getOwnerEn();
    private final String cardNumberApproved = FormOfPayment.getNumberCardApproved();
    private final String monthCorrect = FormOfPayment.getCorrectMonthCard();
    private final String yearCorrect = FormOfPayment.getCorrectYearCard();
    private final String cvcCorrect = FormOfPayment.getCvcCorrect();
    private final String cvcUncorrect = FormOfPayment.getCvcUncorrectOneNumber();
    private final String cvcEmpty = FormOfPayment.getCvcEmpty();

    //Методы для тестов формы "Купить"

    public void cvcCorrectBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(cvcCorrect);
    }

    public void cvcUncorrectBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(String.valueOf(cvcUncorrect));
    }

    public void cvcEmptyBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(cvcEmpty);
    }

    //Методы для тестов формы "Купить в кредит"

    public void cvcCorrectCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(cvcCorrect);
    }

    public void cvcUncorrectCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(String.valueOf(cvcUncorrect));
    }

    public void cvcEmptyCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(cvcEmpty);
    }
}
