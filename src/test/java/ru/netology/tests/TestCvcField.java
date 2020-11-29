package ru.netology.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.BuyForm;
import ru.netology.pages.BuyOnCredit;

import static com.codeborne.selenide.Selenide.open;

public class TestCvcField {
    public BuyForm buyForm = new BuyForm();
    public BuyOnCredit buyOnCredit = new BuyOnCredit();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    //Тесты для формы "Купить"

    @Test
    public void incorrectFormatCvcBuyForm() {
        buyForm.cvcUncorrectBuyForm();
    }

    @Test
    public void emptyFieldCvcBuyForm() { buyForm.cvcEmptyBuyForm();
    }

    //Тесты для формы "Купить в кредит"

    @Test
    public void incorrectFormatCvcCreditForm() {
        buyOnCredit.cvcUncorrectCreditForm();
    }

    @Test
    public void emptyFieldCvcCreditForm() {
        buyOnCredit.cvcEmptyCreditForm();
    }
}

