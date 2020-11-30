package ru.netology.tests.creditPurchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class MonthFieldCreditForm extends TestBaseUI {

    public PurchaseForm purchaseForm = new PurchaseForm();
    public CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void uncorrectZeroMonthCreditFormTest() {
        creditPurchaseForm.uncorrectZeroMonthCreditForm();
    }

    @Test
    public void uncorrectMonthCreditFormTest() {
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
    public void currentMonthOfTheCardCreditFormTest() {
        creditPurchaseForm.currentMonthOfTheCardCreditForm();
    }
}