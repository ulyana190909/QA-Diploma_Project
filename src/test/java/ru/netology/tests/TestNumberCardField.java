package ru.netology.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.NumberCardField;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestNumberCardField {
    public NumberCardField number = new NumberCardField();
    private final SelenideElement continueField = $(withText("Продолжить"));
    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement errorResult = $(withText("Ошибка! Банк отказал в проведении операции."));
    private final SelenideElement uncorrectFormatNumberCard = $(byText("Неверный формат"));

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctNumberCardApprovedBuyFormTest() {
        number.correctFieldApprovedCardBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void correctNumberCardDeclinedBuyFormTest() {
        number.correctFieldDeclinedCardBuyForm();
        continueField.click();
        errorResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void uncorrectNumberCardBuyFormTest() {
        number.uncorrectNumberCardFieldBuyForm();
        continueField.click();
        errorResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyFielsdNumberCardBuyFormTest() {
        number.emptyNumberCardFieldBuyForm();
        continueField.click();
        uncorrectFormatNumberCard.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void fewNumbersCardBuyFormTest() {
        number.fewNumbersCardInFieldBuyForm();
        continueField.click();
        uncorrectFormatNumberCard.waitUntil(Condition.visible, 12000);
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctNumberCardApprovedCreditFormTest() {
        number.correctFieldApprovedCardCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void correctNumberCardDeclinedCreditFormTest() {
        number.correctFieldDeclinedCardCreditForm();
        continueField.click();
        errorResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void uncorrectNumberCardCreditFormTest() {
        number.uncorrectNumberCardFieldCreditForm();
        continueField.click();
        errorResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyFielsdNumberCardCreditFormTest() {
        number.emptyNumberCardFieldCreditForm();
        continueField.click();
        uncorrectFormatNumberCard.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void fewNumbersCardCreditFormTest() {
        number.fewNumbersCardInFieldCreditForm();
        continueField.click();
        uncorrectFormatNumberCard.waitUntil(Condition.visible, 12000);
    }
}

