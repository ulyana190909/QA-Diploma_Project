package ru.netology.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OwnerField {
    private final SelenideElement buyField = $(withText("Купить"));
    private final SelenideElement buyOnCreditField = $(withText("Купить в кредит"));
    private final SelenideElement numberCardField = $("input[placeholder='0000 0000 0000 0000']");
    private final SelenideElement monthField = $("input[placeholder='08']");
    private final SelenideElement yearField = $("input[placeholder='22']");
    private final ElementsCollection fieldSet = $$(".input__control");
    private final SelenideElement ownerField = fieldSet.get(3);
    private final SelenideElement cvcField = $("input[placeholder='999']");

    private final String ownerInRus = FormOfPayment.getOwnerRu();
    private final String ownerInEng = FormOfPayment.getOwnerEn();
    private final String ownerInZh = FormOfPayment.getOwnerZh();
    private final String emptyOwner = FormOfPayment.getEmptyOwner();
    private final String numberInFieldOwner = FormOfPayment.getNumbersInFieldOwner();
    private final String cardNumberApproved = FormOfPayment.getNumberCardApproved();
    private final String oneLetterInOwnerField = FormOfPayment.getOneLetterInFieldOwner();
    private final String manyLetterInOwnerField = FormOfPayment.getManyLettersInFieldOwner();
    private final String monthCorrect = FormOfPayment.getCorrectMonthCard();
    private final String yearCorrect = FormOfPayment.getCorrectYearCard();
    private final String cvcCorrect = FormOfPayment.getCvcCorrect();
    private final String ownerWithDoubleSurname = FormOfPayment.getOwnerWithDoubleSurname();
    private final String ownerWithNumberPunctuationMarks = FormOfPayment.getOwnerWithNumbersPunctuationMarks();
    private final String ownerWithManySpace = FormOfPayment.getOwnerWithManySpace();

    //Методы для тестов формы "Купить"

    public void correctOwnerFieldEnBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(cvcCorrect);
    }

    public void correctOwnerFieldRuBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void correctOwnerFieldZhBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInZh);
        cvcField.setValue(cvcCorrect);
    }

    public void emptyOwnerFieldBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(emptyOwner);
        cvcField.setValue(cvcCorrect);
    }

    public void numbersInFieldOwnerBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(numberInFieldOwner);
        cvcField.setValue(cvcCorrect);
    }

    public void oneLetterInFieldOwnerBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(oneLetterInOwnerField);
        cvcField.setValue(cvcCorrect);
    }

    public void manyLettersInFieldOwnerBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(manyLetterInOwnerField);
        cvcField.setValue(cvcCorrect);
    }

    public void ownerWithDoubleSurnameBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerWithDoubleSurname);
        cvcField.setValue(cvcCorrect);
    }

    public void ownerWithNumberPunctuationMarksBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerWithNumberPunctuationMarks);
        cvcField.setValue(cvcCorrect);
    }

    public void ownerWithManySpaceBuyForm() {
        buyField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerWithManySpace);
        cvcField.setValue(cvcCorrect);
    }

    //Методы для тестов формы "Купить в кредит"

    public void correctOwnerFieldEnCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInEng);
        cvcField.setValue(cvcCorrect);
    }

    public void correctOwnerFieldRuCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(String.valueOf(ownerInRus));
        cvcField.setValue(cvcCorrect);
    }

    public void correctOwnerFieldZhCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerInZh);
        cvcField.setValue(cvcCorrect);
    }

    public void emptyOwnerFieldCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(emptyOwner);
        cvcField.setValue(cvcCorrect);
    }

    public void numbersInFieldOwnerCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(numberInFieldOwner);
        cvcField.setValue(cvcCorrect);
    }

    public void oneLetterInFieldOwneCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(oneLetterInOwnerField);
        cvcField.setValue(cvcCorrect);
    }

    public void manyLettersInFieldOwnerCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(manyLetterInOwnerField);
        cvcField.setValue(cvcCorrect);
    }

    public void ownerWithDoubleSurnameCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerWithDoubleSurname);
        cvcField.setValue(cvcCorrect);
    }

    public void ownerWithNumberPunctuationMarksCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerWithNumberPunctuationMarks);
        cvcField.setValue(cvcCorrect);
    }

    public void ownerWithManySpaceCreditForm() {
        buyOnCreditField.click();
        numberCardField.setValue(cardNumberApproved);
        monthField.setValue(String.valueOf(monthCorrect));
        yearField.setValue(String.valueOf(yearCorrect));
        ownerField.setValue(ownerWithManySpace);
        cvcField.setValue(cvcCorrect);
    }
}
