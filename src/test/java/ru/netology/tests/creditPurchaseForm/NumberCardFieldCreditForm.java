package ru.netology.tests.creditPurchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class NumberCardFieldCreditForm extends TestBaseUI{

    private PurchaseForm purchaseForm = new PurchaseForm();
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

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

