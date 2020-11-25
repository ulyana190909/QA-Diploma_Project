package ru.netology.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.page.MonthField;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestMonthField {
    public MonthField month = new MonthField();
    private final SelenideElement continueField = $(withText("Продолжить"));
    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement invalidFormatMonth = $(withText("Неверно указан срок действия карты"));
    private final SelenideElement uncorrectFormatMonth = $(withText("Неверный формат"));

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctMonthBuyFormTest() {
        month.correctMonthBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void uncorrectMonthBuyFormTest() {
        month.uncorrectFieldMonthBuyForm();
        continueField.click();
        invalidFormatMonth.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void oneNumberInMonthFieldBuyFormTest() {
        month.oneNumberInMonthFieldBuyForm();
        continueField.click();
        uncorrectFormatMonth.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyFieldMonthBuyFormTest() {
        month.emptyFieldMonthBuyForm();
        continueField.click();
        uncorrectFormatMonth.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void currentMonthOfTheCardBuyFormTest() {
        month.currentMonthOfTheCardBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctMontCreditFormTest() {
        month.correctMonthCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void uncorrectMonthCreditFormTest() {
        month.uncorrectFieldMonthCreditForm();
        continueField.click();
        invalidFormatMonth.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void oneNumberInMonthFieldCreditFormTest() {
        month.oneNumberInMonthFieldCreditForm();
        continueField.click();
        uncorrectFormatMonth.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyFieldMonthCreditFormTest() {
        month.emptyFieldMonthCreditForm();
        continueField.click();
        uncorrectFormatMonth.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void currentMonthOfTheCardCreditFormTest() {
        month.currentMonthOfTheCardCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }
}