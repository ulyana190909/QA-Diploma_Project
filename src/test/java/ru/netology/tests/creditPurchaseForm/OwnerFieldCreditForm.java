package ru.netology.tests.creditPurchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class OwnerFieldCreditForm extends TestBaseUI{

    private PurchaseForm purchaseForm = new PurchaseForm();
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

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
