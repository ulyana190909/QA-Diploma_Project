package ru.netology.tests.purchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.*;

public class NumberCardFieldPurchaseForm extends TestBaseUI{

    private PurchaseForm purchaseForm = new PurchaseForm();
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

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
    public void emptyFielsdNumberCardBuyFormTest() {
        purchaseForm.emptyNumberCardFieldBuyForm();
    }

    @Test
    public void fewNumbersCardBuyFormTest() {
        purchaseForm.fewNumbersCardInFieldBuyForm();
    }

 }

