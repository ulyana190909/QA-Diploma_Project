package ru.netology.tests.purchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

public class OwnerFieldPurchaseForm extends TestBaseUI{
    private PurchaseForm purchaseForm = new PurchaseForm();

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
