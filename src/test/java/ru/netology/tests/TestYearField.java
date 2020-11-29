package ru.netology.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.BuyForm;
import ru.netology.pages.BuyOnCredit;

import static com.codeborne.selenide.Selenide.open;

public class TestYearField {

    private BuyForm buyForm = new BuyForm();
    private BuyOnCredit buyOnCredit = new BuyOnCredit();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void invalidYearFieldBuyFormTest() {
        buyForm.uncorrectFieldYearBuyForm();
    }

    @Test
    public void oneNumberInYearBuyFormTest() {
        buyForm.oneNumberInYearBuyForm();
    }

    @Test
    public void emptyYearFieldBuyFormTest() {
        buyForm.emptyFieldYearBuyForm();
    }

    @Test
    public void expiredYearCardBuyFormTest() {
        buyForm.yearExpiredCardBuyForm();
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void invalidYearFieldCreditFormTest() {
        buyOnCredit.uncorrectFieldYearCreditForm();
    }

    @Test
    public void oneNumberInYearCreditFormTest() {
        buyOnCredit.oneNumberInYearCreditForm();
    }

    @Test
    public void emptyYearFieldCreditFormTest() {
        buyOnCredit.emptyFieldYearCreditForm();
    }

    @Test
    public void expiredYearCardCreditFormTest() {
        buyOnCredit.yearExpiredCardCreditForm();
    }
}
