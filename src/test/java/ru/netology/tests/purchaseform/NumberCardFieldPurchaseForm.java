package ru.netology.tests.purchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

public class NumberCardFieldPurchaseForm extends TestBaseUI {
    private PurchaseForm purchaseForm = new PurchaseForm();

    @Test
    public void correctNumberCardApprovedBuyFormTest() {
        purchaseForm.correctFieldApprovedCardBuyForm();
    }

    @Test
    public void correctNumberCardDeclinedBuyFormTest() {
        purchaseForm.correctFieldDeclinedCardBuyForm();
    }

    @Test
    public void uncorrectNumberCardBuyFormTest() {
        purchaseForm.uncorrectNumberCardFieldBuyForm();
    }

    @Test
    public void emptyFieldNumberCardBuyFormTest() {
        purchaseForm.emptyNumberCardFieldBuyForm();
    }

    @Test
    public void fewNumbersCardBuyFormTest() {
        purchaseForm.fewNumbersCardInFieldBuyForm();
    }
}

