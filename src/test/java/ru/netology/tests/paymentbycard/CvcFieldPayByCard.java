package ru.netology.tests.paymentbycard;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.MainPage;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static ru.netology.data.Data.*;

public class CvcFieldPayByCard extends TestBaseUI {
    private MainPage mainPage = new MainPage();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @BeforeEach
    public void clickBuy() {
        mainPage.clickBuy();
    }

    @Test
    public void testForCorrectFillingCvcFieldPayByCard() {
        val cardData = getCorrectlyCompletedApprovedCardForm();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitSuccessResult();
    }

    @Test
    public void testWithIncorrectFillingInTheCvcFieldPayByCard() {
        val cardData = getFormWithIncorrectCvc();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitIncorrectFormat();
    }

    @Test
    public void testWithEmptyCvcFieldPayByCard() {
        val cardData = getFormWithEmptyFieldCvc();
        purchaseForm.completedPaymentForm(cardData);
        purchaseForm.waitThisFieldIsRequired();
    }
}