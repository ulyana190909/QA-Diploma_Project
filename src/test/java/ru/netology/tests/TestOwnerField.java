package ru.netology.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.OwnerField;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestOwnerField {
    private OwnerField owner = new OwnerField();
    private final SelenideElement continueField = $(withText("Продолжить"));
    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement requiredField = $(byText("Поле обязательно для заполнения"));
    private final SelenideElement uncorrectFormatOwner = $(byText("Неверный формат"));

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctNameFieldEnBuyFormTest() {
        owner.correctOwnerFieldEnBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void correctNameFieldRuBuyFormTest() {
        owner.correctOwnerFieldRuBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void correctNameFieldZhBuyFormTest() {
        owner.correctOwnerFieldZhBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void doubleSurnameOwnerBuyFormTest() {
        owner.ownerWithDoubleSurnameBuyForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyOwnerFieldBuyFormTest() {
        owner.emptyOwnerFieldBuyForm();
        continueField.click();
        requiredField.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void oneLetterInFieldOwnerBuyFormTest() {
        owner.oneLetterInFieldOwnerBuyForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void manyLettersInFieldOwnerBuyFormTest() {
        owner.manyLettersInFieldOwnerBuyForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void numbersInFieldOwnerBuyFormTest() {
        owner.numbersInFieldOwnerBuyForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void manySpaceInFieldOwnerBuyFormTest() {
        owner.ownerWithManySpaceBuyForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void punctuationMarksNumberInOwnerFieldBuyFormTest() {
        owner.ownerWithNumberPunctuationMarksBuyForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctNameFieldEnCreditFormTest() {
        owner.correctOwnerFieldEnCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void correctNameFieldRuCreditFormTest() {
        owner.correctOwnerFieldRuCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void correctNameFieldZhCreditFormTest() {
        owner.correctOwnerFieldZhCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void doubleSurnameOwnerCreditFormTest() {
        owner.ownerWithDoubleSurnameCreditForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void emptyOwnerFieldCreditFormTest() {
        owner.emptyOwnerFieldCreditForm();
        continueField.click();
        requiredField.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void oneLetterInFieldOwnerCreditFormTest() {
        owner.oneLetterInFieldOwneCreditForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void manyLettersInFieldOwnerCreditFormTest() {
        owner.manyLettersInFieldOwnerCreditForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void numbersInFieldOwnerCreditFormTest() {
        owner.numbersInFieldOwnerCreditForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void manySpaceInFieldOwnerCreditFormTest() {
        owner.ownerWithManySpaceCreditForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }

    @Test
    public void punctuationMarksNumberInOwnerFieldCreditFormTest() {
        owner.ownerWithNumberPunctuationMarksCreditForm();
        continueField.click();
        uncorrectFormatOwner.waitUntil(Condition.visible, 12000);
    }
}
