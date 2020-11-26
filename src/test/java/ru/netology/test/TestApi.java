package ru.netology.test;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.netology.api.Api.*;
import static ru.netology.api.Data.getApprovedCard;
import static ru.netology.api.Data.getDeclinedCard;

public class TestApi {

    @Test
    void approvedCardBuyForm() {
        val validApprovedCard = getApprovedCard();
        val status = BuyForm(validApprovedCard);
        assertTrue(status.contains("APPROVED"));
    }

    @Test
    void declinedBuyForm() {
        val validDeclinedCard = getDeclinedCard();
        val status = BuyForm(validDeclinedCard);
        assertTrue(status.contains("DECLINED"));
    }

    @Test
    void approvedCardCreditForm() {
        val validApprovedCard = getApprovedCard();
        val status = CreditForm(validApprovedCard);
        assertTrue(status.contains("APPROVED"));
    }

    @Test
    void declinedCardCreditForm() {
        val validDeclinedCard = getDeclinedCard();
        val status = CreditForm(validDeclinedCard);
        assertTrue(status.contains("DECLINED"));
    }
}
