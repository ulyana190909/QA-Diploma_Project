package ru.netology.tests.paymentoncredit;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static ru.netology.data.Data.*;

public class NumberCardFieldPayOnCredit extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuyOnCredit();
    }

    @Test
    public void testForApprovedCardPayOnCredit() {
        val cardData = getCorrectlyCompletedApprovedCardForm();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testForDeclinedCardPayOnCredit() {
        val cardData = getCorrectlyCompletedDeclinedCardForm();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitError();
    }

    @Test
    public void testWithIncorrectNumberCardPayOnCredit() {
        val cardData = getFormWithIncorrectNumberCard();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitError();
    }

    @Test
    public void testWithEmptyNumberCardPayOnCredit() {
        val cardData = getFormWithEmptyFieldNumberCard();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }

    @Test
    public void testWithDeficientNumbersCardPayOnCredit() {
        val cardData = getFormWithDeficientNumberCard();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }
}

