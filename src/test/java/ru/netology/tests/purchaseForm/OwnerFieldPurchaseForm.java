package ru.netology.tests.purchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class OwnerFieldPurchaseForm extends TestBaseUI{

    private PurchaseForm purchaseForm = new PurchaseForm();
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void correctNameFieldRuBuyFormTest() {
        purchaseForm.correctOwnerFieldRuBuyForm();
    }

    @Test
    public void correctNameFieldZhBuyFormTest() {
        purchaseForm.correctOwnerFieldZhBuyForm();
    }

    @Test
    public void doubleSurnameOwnerBuyFormTest() {
        purchaseForm.ownerWithDoubleSurnameBuyForm();
    }

    @Test
    public void emptyOwnerFieldBuyFormTest() {
        purchaseForm.emptyOwnerFieldBuyForm();
    }

    @Test
    public void oneLetterInFieldOwnerBuyFormTest() {
        purchaseForm.oneLetterInFieldOwnerBuyForm();
    }

    @Test
    public void manyLettersInFieldOwnerBuyFormTest() {
        purchaseForm.manyLettersInFieldOwnerBuyForm();
    }

    @Test
    public void numbersInFieldOwnerBuyFormTest() {
        purchaseForm.numbersInFieldOwnerBuyForm();
    }

    @Test
    public void manySpaceInFieldOwnerBuyFormTest() {
        purchaseForm.ownerWithManySpaceBuyForm();
    }

    @Test
    public void punctuationMarksNumberInOwnerFieldBuyFormTest() {
        purchaseForm.ownerWithNumberPunctuationMarksBuyForm();
    }

}
