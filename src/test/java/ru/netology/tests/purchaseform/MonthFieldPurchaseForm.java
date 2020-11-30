package ru.netology.tests.purchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

public class MonthFieldPurchaseForm extends TestBaseUI {
    public PurchaseForm purchaseForm = new PurchaseForm();

    @Test
    public void correctFieldMonthBuyForm () { purchaseForm.correctFieldApprovedCardBuyForm();}

    @Test
    public void uncorrectZeroMonthBuyFormTest() {
        purchaseForm.uncorrectZeroMonthBuyForm();
    }

    @Test
    public void invalidMonthBuyFormTest() {
        purchaseForm.uncorrectFieldMonthBuyForm();
    }

    @Test
    public void oneNumberInMonthFieldBuyFormTest() {
        purchaseForm.oneNumberInMonthFieldBuyForm();
    }

    @Test
    public void emptyFieldMonthBuyFormTest() {
        purchaseForm.emptyFieldMonthBuyForm();
    }

    @Test
    public void currentMonthInTheMonthFieldBuyFormTest() {
        purchaseForm.currentMonthOfTheCardBuyForm();
    }

}