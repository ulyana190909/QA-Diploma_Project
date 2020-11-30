package ru.netology.tests.purchaseform;

import org.junit.jupiter.api.Test;
import ru.netology.pages.PurchaseForm;
import ru.netology.tests.TestBaseUI;


public class CvcFieldPurchaseForm extends TestBaseUI {
    public PurchaseForm purchaseForm = new PurchaseForm();

    @Test
    public void correctFieldCvcBuyForm () { purchaseForm.correctFieldApprovedCardBuyForm();}

    @Test
    public void incorrectFormatCvcBuyForm() {
        purchaseForm.cvcUncorrectBuyForm();
    }

    @Test
    public void emptyFieldCvcBuyForm() {
        purchaseForm.cvcEmptyBuyForm();
    }
}