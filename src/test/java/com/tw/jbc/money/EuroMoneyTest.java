package com.tw.jbc.money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EuroMoneyTest {

    @Test
    void EuroOf10ShouldBeEqualToEuroOf10() {
        EuroMoney tenEuroMoney= new EuroMoney(10);
        assertEquals(new EuroMoney(10), tenEuroMoney);
    }

    @Test
    void EuroOf10ShouldBeEqualToEuroOf20() {
        EuroMoney tenEuroMoney= new EuroMoney(10);
        assertNotEquals(new EuroMoney(20), tenEuroMoney);
    }

    @Test
    void EuroOf5PlusEuroOf2ShouldBeEqualToEuro10() {
        EuroMoney fiveEuroMoney= new EuroMoney(5);
        EuroMoney twoEuroMoney= new EuroMoney(2);

        assertEquals(new EuroMoney(7), fiveEuroMoney.add(twoEuroMoney));
    }

    @Test
    void EuroOf6PlusEuroOf3ShouldBeEqualToEuro9() {
        EuroMoney fiveEuroMoney= new EuroMoney(6);
        EuroMoney twoEuroMoney= new EuroMoney(3);

        assertEquals(new EuroMoney(9), fiveEuroMoney.add(twoEuroMoney));
    }

}
