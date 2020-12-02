package ru.netology.tests.paymentbycard;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static ru.netology.data.Data.*;

public class HolderFieldPayByCard extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuy();
    }

    @Test
    public void testWithHolderRuPayByCard() {
        val cardData = getFormWithHolderRu();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithHolderZhPayByCard() {
        val cardData = getFormWithHolderZh();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithDoubleSurnameHolderPayByCard() {
        val cardData = getFormWithDoubleSurnameInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithEmptyHolderFieldPayByCard() {
        val cardData = getFormWithEmptyFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }

    @Test
    public void testWithShortNameInFieldHolderPayByCard() {
        val cardData = getFormWithShortNameInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithLongNameInFieldHolderPayByCard() {
        val cardData = getFormWithLongNameInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithNumberInFieldHolderPayByCard() {
        val cardData = getFormWithNumbersInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithManySpaceInFieldHolderPayByCard() {
        val cardData = getFormWithManySpaceInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithPunctuationMarksInFieldHolderPayByCard() {
        val cardData = getFormWithNumbersAndPunctuationMarksInFieldHolder();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }
}
