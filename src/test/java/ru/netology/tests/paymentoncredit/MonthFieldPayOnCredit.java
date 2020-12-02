package ru.netology.tests.paymentoncredit;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static ru.netology.data.Data.*;

public class MonthFieldPayOnCredit extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuyOnCredit();
    }

    @Test
    public void testForCorrectFillingMonthFieldPayOnCredit() {
        val cardData = getCorrectlyCompletedApprovedCardForm();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testZeroMonthPayOnCredit() {
        val cardData = getFormWithIncorrectFieldMonthZero();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitInvalidCardExpirationDate();
    }

    @Test
    public void testWithNonexistentMonthPayOnCredit() {
        val cardData = getFormWithInvalidMonth();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitInvalidCardExpirationDate();
    }

    @Test
    public void testWithIncorrectFillingMonthPayOnCredit() {
        val cardData = getFormWithIncorrectFieldMonthOneNumber();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithEmptyFieldMonthPayOnCredit() {
        val cardData = getFormWithEmptyFieldMonth();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }

    @Test
    public void testWithCurrentCardValidityDatePayOnCredit() {
        val cardData = getFormWithCurrentDate();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }
}