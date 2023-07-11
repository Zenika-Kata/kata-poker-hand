package org.example;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PokerHandTest {

    @Test
    void test_runs_and_can_fail() {
        var pokerHand = new PokerHand();
        assertThat(pokerHand).isNull();
    }
}