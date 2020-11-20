package ru.netology.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class PageThePurchaseOfTheTour {
    private final SelenideElement buyField = $(withText("Купить"));
    private final SelenideElement buyOnCreditField =$(withText("Купить в кредит"));
    private final SelenideElement numberCardField = $("input[placeholder='0000 0000 0000 0000']");
    private final SelenideElement monthField = $("input[placeholder='08']");
    private final SelenideElement yearField = $("input[placeholder='22']");
    private final ElementsCollection fieldSet = $$(".input__control");
    private final SelenideElement ownerField = fieldSet.get(3);
    private final SelenideElement cvcField = $("input[placeholder='999']");
    private final SelenideElement continueField = $(withText("Продолжить"));

    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement errorResult = $(withText("Ошибка! Банк отказал в проведении операции."));

    private final SelenideElement incorrectFormatNumberCard = $(byText("Неверный формат"));
    private final SelenideElement incorrectFormatMonth = $(byText("Неверный формат"));
    private final SelenideElement incorrectFormatYear = $(byText("Неверный формат"));
    private final SelenideElement incorrectFormatOwner = $(byText("Поле обязательно для заполнения"));
    private final SelenideElement incorrectFormatCvc = $(byText("Неверный формат"));

    private FormOfPayment formOfPayment = new FormOfPayment();

    private final FormOfPayment.UserData ownerInRus = FormOfPayment.getOwnerRu();
    private final FormOfPayment.UserData ownerInEng = FormOfPayment.getOwnerEn();
    private final FormOfPayment.UserData ownerInZh = FormOfPayment.getOwnerZh();
    private final FormOfPayment.UserData cardNumberApproved = FormOfPayment.getNumberCardApproved();
    private final FormOfPayment.UserData cardNumberDeclined = FormOfPayment.getNumberCardDeclined();
    private final FormOfPayment.UserData cardNumberEmpty = FormOfPayment.getEmptyNumberCard();
    private final FormOfPayment.UserData cardNumberUncorrect = FormOfPayment.getUncorrectNumberCard();
    private final FormOfPayment.UserData monthCorrect = FormOfPayment.getCorrectMonthCard();
    private final FormOfPayment.UserData monthUncorrect = FormOfPayment.getUncorrectMonthCard();
    private final FormOfPayment.UserData monthUncorrectOneNumber = FormOfPayment.getUncorrectMonthOneNumber();
    private final FormOfPayment.UserData monthEmpty = FormOfPayment.getEmptyMonthCard();
    private final FormOfPayment.UserData yearCorrect = FormOfPayment.getCorrectYearCard();
    private final FormOfPayment.UserData yearUncorrect = FormOfPayment.getUncorrectYearCard();
    private final FormOfPayment.UserData yearEmpty = FormOfPayment.getEmptyYearCard();
    private final FormOfPayment.UserData yearUncorrectOneNumber = FormOfPayment.getUncorrectYearOneNumber();
    private final FormOfPayment.UserData yearExpiredСard = FormOfPayment.getExpiredСardExpiryDate();
    private final FormOfPayment.UserData cvcCorrect = FormOfPayment.getCvcCorrect();
    private final FormOfPayment.UserData cvcUncorrect = FormOfPayment.getCvcUncorrectOneNumber();
    private final FormOfPayment.UserData cvcEmpty = FormOfPayment.getCvcEmpty();


    public FormOfPayment.UserData correctForm (){
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
    public FormOfPayment.UserData uncorrectNumberCard() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberUncorrect));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }

    public FormOfPayment.UserData uncorrectEmptyNumberCard() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberEmpty));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
    public FormOfPayment.UserData correctMonth() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }

    public FormOfPayment.UserData uncorrectMonth() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthUncorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }

    public FormOfPayment.UserData emptyFieldMonth() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthEmpty));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
    public FormOfPayment.UserData correctYear() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
    public FormOfPayment.UserData uncorrectYear() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearUncorrect));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
    public FormOfPayment.UserData emptyFieldYear() {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearEmpty));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
    public FormOfPayment.UserData yearExpiredCard () {
        buyField.click();
        numberCardField.click();
        numberCardField.setValue(String.valueOf(cardNumberApproved));
        monthField.click();
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.click();
        yearField.setValue(String.valueOf(yearExpiredСard));
        ownerField.click();
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.click();
        cvcField.setValue(String.valueOf(cvcCorrect));
        return null;
    }
}
