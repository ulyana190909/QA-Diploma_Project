package ru.netology.tests.purchaseForm;

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

public class HappyPathPurchaseForm extends TestBaseUI {

    PurchaseForm purchaseForm = new PurchaseForm();
    CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void successResultIfApprovedCardsBuyForm() {
        purchaseForm.correctFieldApprovedCardBuyForm();

        val statusExpected = "APPROVED";
        val statusActual = getCardStatusForPayment();
        assertEquals(statusExpected, statusActual);

        val expectedAmount = "4500000";
        val actualAmount = getAmountPayment();
        assertEquals(expectedAmount, actualAmount);

        val transactionIdExpected = getTransactionId();
        val paymentIdActual = getPaymentIdForCardPay();
        assertNotNull(transactionIdExpected);
        assertNotNull(paymentIdActual);
        assertEquals(transactionIdExpected, paymentIdActual);
    }

    @Test
    public void failResultIfDeclinedCardBuyForm() {
        purchaseForm.correctFieldDeclinedCardBuyForm();

        val statusExpected = "DECLINED";
        val statusActual = getCardStatusForPayment();
        assertEquals(statusExpected, statusActual);

        val transactionIdExpected = getTransactionId();
        val paymentIdActual = getPaymentIdForCardPay();
        assertNotNull(transactionIdExpected);
        assertNotNull(paymentIdActual);
        assertEquals(transactionIdExpected, paymentIdActual);
    }
}

