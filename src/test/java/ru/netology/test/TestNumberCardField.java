package ru.netology.test;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.page.PageThePurchaseOfTheTour;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestNumberCardField {
    public PageThePurchaseOfTheTour pageThePurchaseOfTheTour = new PageThePurchaseOfTheTour();

    private final SelenideElement continueField = $(withText("Продолжить"));

    private final SelenideElement successfullResult = $(withText("Операция одобрена Банком."));
    private final SelenideElement errorResult = $(withText("Ошибка! Банк отказал в проведении операции."));

    private final SelenideElement uncorrectFormatNumberCard = $(byText("Неверный формат"));
    private final SelenideElement incorrectFormatMonth = $(byText("Неверный формат"));
    private final SelenideElement incorrectFormatYear = $(byText("Неверный формат"));
    private final SelenideElement incorrectFormatOwner = $(byText("Поле обязательно для заполнения"));
    private final SelenideElement incorrectFormatCvc = $(byText("Неверный формат"));


    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void correctTest() {
        pageThePurchaseOfTheTour.correctForm();
        continueField.click();
        successfullResult.waitUntil(Condition.visible, 150000);
    }

    @Test
    public void uncorrectNmberCard() {
        pageThePurchaseOfTheTour.uncorrectNumberCard();
        continueField.click();
        errorResult.waitUntil(Condition.visible, 15000);
   }
    @Test
    public void uncorrectEmptyNumberCard(){
        pageThePurchaseOfTheTour.uncorrectEmptyNumberCard();
        continueField.click();
        uncorrectFormatNumberCard.waitUntil(Condition.visible,15000);
    }

}

//не все тесты написала)
