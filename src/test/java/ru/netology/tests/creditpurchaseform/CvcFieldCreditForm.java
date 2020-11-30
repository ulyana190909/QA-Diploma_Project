package ru.netology.tests.creditpurchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

public class CvcFieldCreditForm extends TestBaseUI {
    public CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @Test
    public void correctFieldCvcCreditForm () { creditPurchaseForm.correctFieldApprovedCardCreditForm();}

    @Test
    public void incorrectFormatCvcCreditForm() {
        creditPurchaseForm.cvcUncorrectCreditForm();
    }

    @Test
    public void emptyFieldCvcCreditForm() {
        creditPurchaseForm.cvcEmptyCreditForm();
    }
}

