package ru.netology.tests.creditpurchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

public class NumberCardFieldCreditForm extends TestBaseUI {
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @Test
    public void correctNumberCardApprovedCreditFormTest() {
        creditPurchaseForm.correctFieldApprovedCardCreditForm();
    }

    @Test
    public void correctNumberCardDeclinedCreditFormTest() {
        creditPurchaseForm.correctFieldDeclinedCardCreditForm();
    }

    @Test
    public void uncorrectNumberCardCreditFormTest() {
        creditPurchaseForm.uncorrectNumberCardFieldCreditForm();
    }

    @Test
    public void emptyFielsdNumberCardCreditFormTest() {
        creditPurchaseForm.emptyNumberCardFieldCreditForm();
    }

    @Test
    public void fewNumbersCardCreditFormTest() {
        creditPurchaseForm.fewNumbersCardInFieldCreditForm();
    }
}

