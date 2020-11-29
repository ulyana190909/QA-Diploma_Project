package ru.netology.tests;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.netology.data.Api.*;
import static ru.netology.data.Data.getApprovedCard;
import static ru.netology.data.Data.getDeclinedCard;

public class TestApi {

    @Test
    void approvedCardBuyForm() {
        val validApprovedCard = getApprovedCard();
        val status = buyForm(validApprovedCard);
        assertTrue(status.contains("APPROVED"));
    }

    @Test
    void declinedBuyForm() {
        val validDeclinedCard = getDeclinedCard();
        val status = buyForm(validDeclinedCard);
        assertTrue(status.contains("DECLINED"));
    }

    @Test
    void approvedCardCreditForm() {
        val validApprovedCard = getApprovedCard();
        val status = creditForm(validApprovedCard);
        assertTrue(status.contains("APPROVED"));
    }

    @Test
    void declinedCardCreditForm() {
        val validDeclinedCard = getDeclinedCard();
        val status = creditForm(validDeclinedCard);
        assertTrue(status.contains("DECLINED"));
    }
}
