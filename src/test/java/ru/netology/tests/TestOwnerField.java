package ru.netology.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.BuyForm;
import ru.netology.pages.BuyOnCredit;

import static com.codeborne.selenide.Selenide.open;

public class TestOwnerField {

    private BuyForm buyForm = new BuyForm();
    private BuyOnCredit buyOnCredit = new BuyOnCredit();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctNameFieldRuBuyFormTest() {
        buyForm.correctOwnerFieldRuBuyForm();
    }

    @Test
    public void correctNameFieldZhBuyFormTest() {
        buyForm.correctOwnerFieldZhBuyForm();
    }

    @Test
    public void doubleSurnameOwnerBuyFormTest() {
        buyForm.ownerWithDoubleSurnameBuyForm();
    }

    @Test
    public void emptyOwnerFieldBuyFormTest() {
        buyForm.emptyOwnerFieldBuyForm();
    }

    @Test
    public void oneLetterInFieldOwnerBuyFormTest() {
        buyForm.oneLetterInFieldOwnerBuyForm();
    }

    @Test
    public void manyLettersInFieldOwnerBuyFormTest() {
        buyForm.manyLettersInFieldOwnerBuyForm();
    }

    @Test
    public void numbersInFieldOwnerBuyFormTest() {
        buyForm.numbersInFieldOwnerBuyForm();
    }

    @Test
    public void manySpaceInFieldOwnerBuyFormTest() {
        buyForm.ownerWithManySpaceBuyForm();
    }

    @Test
    public void punctuationMarksNumberInOwnerFieldBuyFormTest() {
        buyForm.ownerWithNumberPunctuationMarksBuyForm();
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctNameFieldRuCreditFormTest() {
        buyOnCredit.correctOwnerFieldRuCreditForm();
    }

    @Test
    public void correctNameFieldZhCreditFormTest() {
        buyOnCredit.correctOwnerFieldZhCreditForm();
    }

    @Test
    public void doubleSurnameOwnerCreditFormTest() {
        buyOnCredit.ownerWithDoubleSurnameCreditForm();
    }

    @Test
    public void emptyOwnerFieldCreditFormTest() {
        buyOnCredit.emptyOwnerFieldCreditForm();
    }

    @Test
    public void oneLetterInFieldOwnerCreditFormTest() {
        buyOnCredit.oneLetterInFieldOwnerCreditForm();
    }

    @Test
    public void manyLettersInFieldOwnerCreditFormTest() {
        buyOnCredit.manyLettersInFieldOwnerCreditForm();
    }

    @Test
    public void numbersInFieldOwnerCreditFormTest() {
        buyOnCredit.numbersInFieldOwnerCreditForm();
    }

    @Test
    public void manySpaceInFieldOwnerCreditFormTest() {
        buyOnCredit.ownerWithManySpaceCreditForm();
    }

    @Test
    public void punctuationMarksNumberInOwnerFieldCreditFormTest() {
        buyOnCredit.ownerWithNumberPunctuationMarksCreditForm();
    }
}
