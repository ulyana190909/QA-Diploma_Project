package ru.netology.tests.creditPurchaseForm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.pages.CreditPurchaseForm;
import ru.netology.tests.TestBaseUI;

import static com.codeborne.selenide.Selenide.open;

public class CvcFieldCreditForm extends TestBaseUI {
    public PurchaseForm purchaseForm = new PurchaseForm();
    public CreditPurchaseForm creditPurchaseForm = new CreditPurchaseForm();

    @BeforeEach
    public void setUp() {
        open("http://localhost:8090/");
    }

    @Test
    public void incorrectFormatCvcCreditForm() {
        creditPurchaseForm.cvcUncorrectCreditForm();
    }

    @Test
    public void emptyFieldCvcCreditForm() {
        creditPurchaseForm.cvcEmptyCreditForm();
    }
}

