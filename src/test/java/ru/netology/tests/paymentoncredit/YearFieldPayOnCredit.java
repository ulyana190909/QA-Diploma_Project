package ru.netology.tests.paymentoncredit;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static ru.netology.data.Data.*;

public class YearFieldPayOnCredit extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuyOnCredit();
    }

    @Test
    public void testForCorrectFillingYearFieldPayOnCredit() {
        val cardData = getCorrectlyCompletedApprovedCardForm();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithInvalidFillingYearPayOnCredit() {
        val cardData = getFormWithInvalidYear();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitInvalidCardExpirationDate();
    }

    @Test
    public void testWithIncorrectFillingYearPayOnCredit() {
        val cardData = getFormWithIncorrectFieldYearOneNumber();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithEmptyFieldYearPayOnCredit() {
        val cardData = getFormWithEmptyYear();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }

    @Test
    public void testWithExpiredYearPayOnCredit() {
        val cardData = getFormWithExpiredYear();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitCardExpired();
    }
}
