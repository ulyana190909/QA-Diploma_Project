package ru.netology.tests.paymentoncredit;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static ru.netology.data.Data.*;


public class HolderFieldPayOnCredit extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuyOnCredit();
    }

    @Test
    public void testWithHolderRuPayOnCredit() {
        val cardData = getFormWithHolderRu();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithHolderZhPayOnCredit() {
        val cardData = getFormWithHolderZh();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithDoubleSurnameHolderPayOnCredit() {
        val cardData = getFormWithDoubleSurnameInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithEmptyHolderFieldPayOnCredit() {
        val cardData = getFormWithEmptyFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }

    @Test
    public void testWithShortNameInFieldHolderPayOnCredit() {
        val cardData = getFormWithShortNameInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithLongNameInFieldHolderPayOnCredit() {
        val cardData = getFormWithLongNameInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithNumberInFieldHolderPayOnCredit() {
        val cardData = getFormWithNumbersInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithManySpaceInFieldHolderPayOnCredit() {
        val cardData = getFormWithManySpaceInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithPunctuationMarksInFieldHolderPayOnCredit() {
        val cardData = getFormWithNumbersAndPunctuationMarksInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }
}
