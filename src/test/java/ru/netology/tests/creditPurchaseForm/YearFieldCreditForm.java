package ru.netology.tests.creditPurchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class YearFieldCreditForm extends TestBaseUI {

    private PurchaseForm purchaseForm = new PurchaseForm();
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void invalidYearFieldCreditFormTest() {
        creditPurchaseForm.uncorrectFieldYearCreditForm();
    }

    @Test
    public void oneNumberInYearCreditFormTest() {
        creditPurchaseForm.oneNumberInYearCreditForm();
    }

    @Test
    public void emptyYearFieldCreditFormTest() {
        creditPurchaseForm.emptyFieldYearCreditForm();
    }

    @Test
    public void expiredYearCardCreditFormTest() {
        creditPurchaseForm.yearExpiredCardCreditForm();
    }
}
