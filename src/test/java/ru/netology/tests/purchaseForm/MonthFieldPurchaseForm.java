package ru.netology.tests.purchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.*;

public class MonthFieldPurchaseForm extends TestBaseUI {

    public PurchaseForm purchaseForm = new PurchaseForm();
    public CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void uncorrectZeroMonthBuyFormTest() {
        purchaseForm.uncorrectZeroMonthBuyForm();
    }

    @Test
    public void uncorrectMonthBuyFormTest() {
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
    public void currentMonthOfTheCardBuyFormTest() {
        purchaseForm.currentMonthOfTheCardBuyForm();
    }

}