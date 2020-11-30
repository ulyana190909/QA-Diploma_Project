package ru.netology.tests.purchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;

import ru.netology.tests.TestBaseUI;

public class YearFieldPurchaseForm extends TestBaseUI {
    private PurchaseForm purchaseForm = new PurchaseForm();

    @Test
    public void correctYearFieldCreditFormTest() {
        purchaseForm.correctFieldApprovedCardBuyForm();
    }

    @Test
    public void invalidYearFieldBuyFormTest() {
        purchaseForm.uncorrectFieldYearBuyForm();
    }

    @Test
    public void oneNumberInYearBuyFormTest() {
        purchaseForm.oneNumberInYearBuyForm();
    }

    @Test
    public void emptyYearFieldBuyFormTest() {
        purchaseForm.emptyFieldYearBuyForm();
    }

    @Test
    public void expiredYearCardBuyFormTest() {
        purchaseForm.yearExpiredCardBuyForm();
    }
}
