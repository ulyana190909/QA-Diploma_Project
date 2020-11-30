package ru.netology.tests.creditpurchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

public class YearFieldCreditForm extends TestBaseUI {
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @Test
    public void correctYearFieldCreditFormTest() {creditPurchaseForm.correctFieldApprovedCardCreditForm();}

    @Test
    public void invalidYearFieldCreditFormTest() {
        creditPurchaseForm.uncorrectFieldYearCreditForm();
    }

    @Test
    public void oneNumberInYearCreditFormTest() {
        creditPurchaseForm.oneNumberInYearCreditForm();
    }

    @Test
    public void emptyYearFieldCreditFormTest() {
        creditPurchaseForm.emptyFieldYearCreditForm();
    }

    @Test
    public void expiredYearCardCreditFormTest() {
        creditPurchaseForm.yearExpiredCardCreditForm();
    }
}
