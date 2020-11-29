package ru.netology.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.YearField;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestYearField {
    public YearField year = new YearField();
    private final SelenideElement continueField = $(withText("Продолжить"));
    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement uncorrectFormatYear = $(withText("Неверный формат"));
    private final SelenideElement expiredCard = $(withText("Истёк срок действия карты"));
    private final SelenideElement invalidYearField = $(withText("Неверно указан срок действия карты"));

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctYearBuyFormTest() {
        year.correctYearBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void invalidYearFieldBuyFormTest() {
        year.uncorrectFieldYearBuyForm();
        continueField.click();
        invalidYearField.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void oneNumberInYearBuyFormTest() {
        year.oneNumberInYearBuyForm();
        continueField.click();
        uncorrectFormatYear.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyYearFieldBuyFormTest() {
        year.emptyFieldYearBuyForm();
        continueField.click();
        uncorrectFormatYear.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void expiredYearCardBuyFormTest() {
        year.yearExpiredCardBuyForm();
        continueField.click();
        expiredCard.waitUntil(Condition.visible, 12000);
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctYearCreditFormTest() {
        year.correctYearCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void invalidYearFieldCreditFormTest() {
        year.uncorrectFieldYearCreditForm();
        continueField.click();
        invalidYearField.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void oneNumberInYearCreditFormTest() {
        year.oneNumberInYearCreditForm();
        continueField.click();
        uncorrectFormatYear.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyYearFieldCreditFormTest() {
        year.emptyFieldYearCreditForm();
        continueField.click();
        uncorrectFormatYear.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void expiredYearCardCreditFormTest() {
        year.yearExpiredCardCreditForm();
        continueField.click();
        expiredCard.waitUntil(Condition.visible, 12000);
    }
}
