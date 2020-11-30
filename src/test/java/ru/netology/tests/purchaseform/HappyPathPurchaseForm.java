package ru.netology.tests.purchaseform;

import lombok.val;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.netology.data.SQL.*;

public class HappyPathPurchaseForm extends TestBaseUI {
    PurchaseForm purchaseForm = new PurchaseForm();

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

