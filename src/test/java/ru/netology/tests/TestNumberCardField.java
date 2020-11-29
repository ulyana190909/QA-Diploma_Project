package ru.netology.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.BuyForm;
import ru.netology.pages.BuyOnCredit;

import static com.codeborne.selenide.Selenide.*;

public class TestNumberCardField {

    private BuyForm buyForm = new BuyForm();
    private BuyOnCredit buyOnCredit = new BuyOnCredit();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void correctNumberCardApprovedBuyFormTest() {
        buyForm.correctFieldApprovedCardBuyForm();
    }

    @Test
    public void correctNumberCardDeclinedBuyFormTest() {
        buyForm.correctFieldDeclinedCardBuyForm();
    }

    @Test
    public void uncorrectNumberCardBuyFormTest() {
        buyForm.uncorrectNumberCardFieldBuyForm();
    }

    @Test
    public void emptyFielsdNumberCardBuyFormTest() {
        buyForm.emptyNumberCardFieldBuyForm();
    }

    @Test
    public void fewNumbersCardBuyFormTest() {
        buyForm.fewNumbersCardInFieldBuyForm();
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void correctNumberCardApprovedCreditFormTest() {
        buyOnCredit.correctFieldApprovedCardCreditForm();
    }

    @Test
    public void correctNumberCardDeclinedCreditFormTest() {
        buyOnCredit.correctFieldDeclinedCardCreditForm();
    }

    @Test
    public void uncorrectNumberCardCreditFormTest() {
        buyOnCredit.uncorrectNumberCardFieldCreditForm();
    }

    @Test
    public void emptyFielsdNumberCardCreditFormTest() {
        buyOnCredit.emptyNumberCardFieldCreditForm();
    }

    @Test
    public void fewNumbersCardCreditFormTest() {
        buyOnCredit.fewNumbersCardInFieldCreditForm();
    }
}

