package ru.netology.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.Value;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

@Value
@AllArgsConstructor
public class MainPage {
    private final SelenideElement buyField = $(withText("Купить"));
    private final SelenideElement buyOnCreditField = $(withText("Купить в кредит"));
    private final SelenideElement continueField = $(withText("Продолжить"));

    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement invalidFormat= $(withText("Неверно указан срок действия карты"));
    private final SelenideElement uncorrectFormat = $(withText("Неверный формат"));
    private final SelenideElement errorResult = $(withText("Ошибка! Банк отказал в проведении операции."));
    private final SelenideElement expiredCard = $(withText("Истёк срок действия карты"));
    private final SelenideElement requiredFieldCvc = $(withText("Поле обязательно для заполнения"));


    public void clickBuy() { buyField.click(); }

    public void clickBuyOnCredit() {
        buyOnCreditField.click();
    }

    public void clickButtonContinue() {continueField.click(); }

    public void successResult() { successfullResult.waitUntil(Condition.visible, 12000); }

    public void invalidResult() {invalidFormat.waitUntil(Condition.visible, 12000); }

    public void uncorrectResult() {uncorrectFormat.waitUntil(Condition.visible, 12000); }

    public void errorResult() {errorResult.waitUntil(Condition.visible, 12000); }

    public void expiredResult() {expiredCard.waitUntil(Condition.visible, 12000);}

    public void requiredResult() {requiredFieldCvc.waitUntil(Condition.visible, 12000);}

}
