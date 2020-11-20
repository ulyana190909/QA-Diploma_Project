package ru.netology.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.page.PageThePurchaseOfTheTour;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestYearField {
    public PageThePurchaseOfTheTour pageThePurchaseOfTheTour = new PageThePurchaseOfTheTour();

    private final SelenideElement continueField = $(withText("Продолжить"));

    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement uncorrectFormatYear = $(withText("Неверный формат"));  //1 цифра, пустое поле
    private final SelenideElement expiredCard = $(withText("Истёк срок действия карты")); //просрочка
    private final SelenideElement invalidYearField = $(withText("Неверно указан срок действия карты")); //поздний срок

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void correctYearField() {
        pageThePurchaseOfTheTour.correctYear();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 15000);
    }
//бывают странности

    @Test
    public void invalidYearField() {
        pageThePurchaseOfTheTour.uncorrectYear();
        continueField.click();
        invalidYearField.waitUntil(Condition.visible, 12000);
    }
    @Test
    public void emptyFieldYear() {
        pageThePurchaseOfTheTour.emptyFieldYear();
        continueField.click();
        uncorrectFormatYear.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void yearExpiredCard() {
        pageThePurchaseOfTheTour.yearExpiredCard();
        continueField.click();
        expiredCard.waitUntil(Condition.visible, 12000);
    }

}
