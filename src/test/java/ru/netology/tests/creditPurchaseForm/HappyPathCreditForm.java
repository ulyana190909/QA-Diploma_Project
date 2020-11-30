package ru.netology.tests.creditPurchaseForm;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.netology.data.SQL.*;

public class HappyPathCreditForm extends TestBaseUI {

    PurchaseForm purchaseForm = new PurchaseForm();
    CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void successResultIfApprovedCardsCreditForm() {
        creditPurchaseForm.correctFieldApprovedCardCreditForm();

        val statusExpected = "APPROVED";
        val statusActual = getCardStatusForCreditRequest();
        assertEquals(statusExpected, statusActual);

        val bankIdExpected = getBankId();
        val paymentIdActual = getPaymentIdForCreditRequest();
        assertNotNull(bankIdExpected);
        assertNotNull(paymentIdActual);
        assertEquals(bankIdExpected, paymentIdActual);
    }

    @Test
    public void failResultIfDeclinedCardsCreditForm() {
        creditPurchaseForm.correctFieldDeclinedCardCreditForm();
        val statusExpected = "DECLINED";
        val statusActual = getCardStatusForCreditRequest();
        assertEquals(statusExpected, statusActual);

        val bankIdExpected = getBankId();
        val paymentIdActual = getPaymentIdForCreditRequest();
        assertNotNull(bankIdExpected);
        assertNotNull(paymentIdActual);
        assertEquals(bankIdExpected, paymentIdActual);
    }
}

