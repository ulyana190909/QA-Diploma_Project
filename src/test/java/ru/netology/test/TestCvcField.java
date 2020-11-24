package ru.netology.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.page.CvcField;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestCvcField {
    public CvcField cvc = new CvcField();
    private final SelenideElement continueField = $(withText("Продолжить"));
    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement incorrectFormatCvc = $(withText("Неверный формат"));
    private final SelenideElement requiredFieldCvc = $(withText("Поле обязательно для заполнения"));

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctCvcBuyForm() {
        cvc.cvcCorrectBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void incorrectFormatCvcBuyForm() {
        cvc.cvcUncorrectBuyForm();
        continueField.click();
        incorrectFormatCvc.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyFieldCvcBuyForm() {
        cvc.cvcEmptyBuyForm();
        continueField.click();
        incorrectFormatCvc.waitUntil(Condition.visible, 12000);
        requiredFieldCvc.waitUntil(Condition.visible, 12000);
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctCvcCreditForm() {
        cvc.cvcCorrectCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void incorrectFormatCvcCreditForm() {
        cvc.cvcUncorrectCreditForm();
        continueField.click();
        incorrectFormatCvc.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyFieldCvcCreditForm() {
        cvc.cvcEmptyCreditForm();
        continueField.click();
        incorrectFormatCvc.waitUntil(Condition.visible, 12000);
        requiredFieldCvc.waitUntil(Condition.visible, 12000);
    }
}

