package ru.netology.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.Data;

import static com.codeborne.selenide.Selenide.*;

public class CreditPurchaseForm {
    private final SelenideElement numberCardField = $("input[placeholder='0000 0000 0000 0000']");
    private final SelenideElement monthField = $("input[placeholder='08']");
    private final SelenideElement yearField = $("input[placeholder='22']");
    private final ElementsCollection fieldSet = $$(".input__control");
    private final SelenideElement ownerField = fieldSet.get(3);
    private final SelenideElement cvcField = $("input[placeholder='999']");

    private MainPage mainPage = new MainPage();
    private Data data = new Data();


    public void correctFieldApprovedCardCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void correctFieldDeclinedCardCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardDeclined());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.errorResult();
    }

    public void uncorrectNumberCardFieldCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getUncorrectNumberCard());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.errorResult();
    }

    public void emptyNumberCardFieldCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getEmptyNumberCard());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void fewNumbersCardInFieldCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getFewNumbersCard());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }


    public void uncorrectZeroMonthCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getIncorrectZeroMonth());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.invalidResult();
    }

    public void uncorrectFieldMonthCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getUncorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.invalidResult();
    }

    public void oneNumberInMonthFieldCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getUncorrectMonthOneNumber());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void emptyFieldMonthCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getEmptyMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void currentMonthOfTheCardCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getThisMonth());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void uncorrectFieldYearCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getUncorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.invalidResult();
    }

    public void oneNumberInYearCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getUncorrectYearOneNumber());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void emptyFieldYearCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getEmptyYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void yearExpiredCardCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getExpiredСardExpiryDate());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.expiredResult();
    }


    public void correctOwnerFieldRuCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerRu());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void correctOwnerFieldZhCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerZh());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void emptyOwnerFieldCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getEmptyOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.requiredResult();
    }

    public void numbersInFieldOwnerCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getNumbersInFieldOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void oneLetterInFieldOwnerCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOneLetterInFieldOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void manyLettersInFieldOwnerCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getManyLettersInFieldOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void ownerWithDoubleSurnameCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerWithDoubleSurname());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void ownerWithNumberPunctuationMarksCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerWithNumbersPunctuationMarks());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void ownerWithManySpaceCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerWithManySpace());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }


    public void cvcUncorrectCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcUncorrectOneNumber());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void cvcEmptyCreditForm() {
        mainPage.clickBuyOnCredit();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcEmpty());
        mainPage.clickButtonContinue();
        mainPage.requiredResult();
        mainPage.uncorrectResult();
    }
}
