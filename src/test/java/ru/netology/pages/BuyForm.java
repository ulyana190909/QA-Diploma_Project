package ru.netology.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.Data;

import static com.codeborne.selenide.Selenide.*;

public class BuyForm {
    private final SelenideElement numberCardField = $("input[placeholder='0000 0000 0000 0000']");
    private final SelenideElement monthField = $("input[placeholder='08']");
    private final SelenideElement yearField = $("input[placeholder='22']");
    private final ElementsCollection fieldSet = $$(".input__control");
    private final SelenideElement ownerField = fieldSet.get(3);
    private final SelenideElement cvcField = $("input[placeholder='999']");

    private MainPage mainPage = new MainPage();
    private Data data = new Data();


    public void correctFieldApprovedCardBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void correctFieldDeclinedCardBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardDeclined());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.errorResult();
    }

    public void uncorrectNumberCardFieldBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getUncorrectNumberCard());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.errorResult();
    }

    public void emptyNumberCardFieldBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getEmptyNumberCard());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void fewNumbersCardInFieldBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getFewNumbersCard());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }


    public void uncorrectZeroMonthBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getIncorrectZeroMonth());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.invalidResult();
    }

    public void uncorrectFieldMonthBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getUncorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.invalidResult();
    }

    public void oneNumberInMonthFieldBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getUncorrectMonthOneNumber());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void emptyFieldMonthBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getEmptyMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void currentMonthOfTheCardBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getThisMonth());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }


    public void uncorrectFieldYearBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getUncorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.invalidResult();
    }

    public void oneNumberInYearBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getUncorrectYearOneNumber());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void emptyFieldYearBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getEmptyYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void yearExpiredCardBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getExpiredСardExpiryDate());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.expiredResult();
    }


    public void correctOwnerFieldRuBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerRu());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void correctOwnerFieldZhBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerZh());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void emptyOwnerFieldBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getEmptyOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.requiredResult();
        mainPage.uncorrectResult();
    }

    public void numbersInFieldOwnerBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getNumbersInFieldOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
    }

    public void oneLetterInFieldOwnerBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOneLetterInFieldOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void manyLettersInFieldOwnerBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getManyLettersInFieldOwner());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void ownerWithDoubleSurnameBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerWithDoubleSurname());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.successResult();
    }

    public void ownerWithNumberPunctuationMarksBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerWithNumbersPunctuationMarks());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void ownerWithManySpaceBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerWithManySpace());
        cvcField.setValue(data.getCvcCorrect());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }


    public void cvcUncorrectBuyForm() {
        mainPage.clickBuy();
        numberCardField.setValue(data.getNumberCardApproved());
        monthField.setValue(data.getCorrectMonthCard());
        yearField.setValue(data.getCorrectYearCard());
        ownerField.setValue(data.getOwnerEn());
        cvcField.setValue(data.getCvcUncorrectOneNumber());
        mainPage.clickButtonContinue();
        mainPage.uncorrectResult();
    }

    public void cvcEmptyBuyForm() {
        mainPage.clickBuy();
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
