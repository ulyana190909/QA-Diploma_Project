package ru.netology.tests.creditpurchaseform;

import org.junit.jupiter.api.Test;

import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

public class MonthFieldCreditForm extends TestBaseUI {
    public CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @Test
    public void correctFieldMonthCreditForm () { creditPurchaseForm.correctFieldApprovedCardCreditForm();}

    @Test
    public void uncorrectZeroMonthCreditFormTest() {
        creditPurchaseForm.uncorrectZeroMonthCreditForm();
    }

    @Test
    public void invalidMonthCreditFormTest() {
        creditPurchaseForm.uncorrectFieldMonthCreditForm();
    }

    @Test
    public void oneNumberInMonthFieldCreditFormTest() {
        creditPurchaseForm.oneNumberInMonthFieldCreditForm();
    }

    @Test
    public void emptyFieldMonthCreditFormTest() {
        creditPurchaseForm.emptyFieldMonthCreditForm();
    }

    @Test
    public void currentMonthInTheMonthFieldCreditFormTest() {
        creditPurchaseForm.currentMonthOfTheCardCreditForm();
    }
}