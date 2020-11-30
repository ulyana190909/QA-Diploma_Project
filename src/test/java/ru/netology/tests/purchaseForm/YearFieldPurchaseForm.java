package ru.netology.tests.purchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class YearFieldPurchaseForm extends TestBaseUI {

    private PurchaseForm purchaseForm = new PurchaseForm();
    private CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void invalidYearFieldBuyFormTest() {
        purchaseForm.uncorrectFieldYearBuyForm();
    }

    @Test
    public void oneNumberInYearBuyFormTest() {
        purchaseForm.oneNumberInYearBuyForm();
    }

    @Test
    public void emptyYearFieldBuyFormTest() {
        purchaseForm.emptyFieldYearBuyForm();
    }

    @Test
    public void expiredYearCardBuyFormTest() {
        purchaseForm.yearExpiredCardBuyForm();
    }
}
