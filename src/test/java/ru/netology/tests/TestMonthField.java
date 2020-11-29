package ru.netology.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.BuyForm;
import ru.netology.pages.BuyOnCredit;

import static com.codeborne.selenide.Selenide.*;

public class TestMonthField {

    public BuyForm buyForm = new BuyForm();
    public BuyOnCredit buyOnCredit = new BuyOnCredit();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void uncorrectZeroMonthBuyFormTest() {
        buyForm.uncorrectZeroMonthBuyForm();
    }

    @Test
    public void uncorrectMonthBuyFormTest() {
        buyForm.uncorrectFieldMonthBuyForm();
    }

    @Test
    public void oneNumberInMonthFieldBuyFormTest() {
        buyForm.oneNumberInMonthFieldBuyForm();
    }

    @Test
    public void emptyFieldMonthBuyFormTest() {
        buyForm.emptyFieldMonthBuyForm();
    }

    @Test
    public void currentMonthOfTheCardBuyFormTest() {
        buyForm.currentMonthOfTheCardBuyForm();
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void uncorrectZeroMonthCreditFormTest() {
        buyOnCredit.uncorrectZeroMonthCreditForm();
    }

    @Test
    public void uncorrectMonthCreditFormTest() {
        buyOnCredit.uncorrectFieldMonthCreditForm();
    }

    @Test
    public void oneNumberInMonthFieldCreditFormTest() {
        buyOnCredit.oneNumberInMonthFieldCreditForm();
    }

    @Test
    public void emptyFieldMonthCreditFormTest() {
        buyOnCredit.emptyFieldMonthCreditForm();
    }

    @Test
    public void currentMonthOfTheCardCreditFormTest() {
        buyOnCredit.currentMonthOfTheCardCreditForm();
    }
}