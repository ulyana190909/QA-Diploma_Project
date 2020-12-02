package ru.netology.tests.paymentbycard;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static ru.netology.data.Data.*;

public class MonthFieldPayByCard extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuy();
    }

    @Test
    public void testForCorrectFillingMonthFieldPayByCard() {
        val cardData = getCorrectlyCompletedApprovedCardForm();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testZeroMonthPayByCard() {
        val cardData = getFormWithIncorrectFieldMonthZero();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitInvalidCardExpirationDate();
    }

    @Test
    public void testWithNonexistentMonthPayByCard() {
        val cardData = getFormWithInvalidMonth();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitInvalidCardExpirationDate();
    }

    @Test
    public void testWithIncorrectFillingMonthPayByCard() {
        val cardData = getFormWithIncorrectFieldMonthOneNumber();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithEmptyFieldMonthPayByCard() {
        val cardData = getFormWithEmptyFieldMonth();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }

    @Test
    public void testWithCurrentCardValidityDatePayByCard() {
        val cardData = getFormWithCurrentDate();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }
}