package ru.netology.tests.creditpurchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;


public class OwnerFieldCreditForm extends TestBaseUI{
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @Test
    public void correctNameFieldRuCreditFormTest() {
        creditPurchaseForm.correctOwnerFieldRuCreditForm();
    }

    @Test
    public void correctNameFieldZhCreditFormTest() {
        creditPurchaseForm.correctOwnerFieldZhCreditForm();
    }

    @Test
    public void doubleSurnameOwnerCreditFormTest() {
        creditPurchaseForm.ownerWithDoubleSurnameCreditForm();
    }

    @Test
    public void emptyOwnerFieldCreditFormTest() {
        creditPurchaseForm.emptyOwnerFieldCreditForm();
    }

    @Test
    public void oneLetterInFieldOwnerCreditFormTest() {
        creditPurchaseForm.oneLetterInFieldOwnerCreditForm();
    }

    @Test
    public void manyLettersInFieldOwnerCreditFormTest() {
        creditPurchaseForm.manyLettersInFieldOwnerCreditForm();
    }

    @Test
    public void numbersInFieldOwnerCreditFormTest() {
        creditPurchaseForm.numbersInFieldOwnerCreditForm();
    }

    @Test
    public void manySpaceInFieldOwnerCreditFormTest() {
        creditPurchaseForm.ownerWithManySpaceCreditForm();
    }

    @Test
    public void punctuationMarksNumberInOwnerFieldCreditFormTest() {
        creditPurchaseForm.ownerWithNumberPunctuationMarksCreditForm();
    }
}
