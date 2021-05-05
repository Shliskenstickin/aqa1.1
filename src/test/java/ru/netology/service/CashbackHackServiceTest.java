package ru.netology.service;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest extends TestCase {
    CashbackHackService cashbackHackService = new CashbackHackService();

    public void testRemain0() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(expected, actual);
    }
    public void testRemain1000() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }
    public void testRemain1500() {
        int expected = 500;
        int actual = cashbackHackService.remain(1500);

        assertEquals(expected, actual);
    }
    public void testRemainLowerZero() {
        int expected = 1000;
        int actual = cashbackHackService.remain(-1);

        assertEquals(expected, actual);
    }

    @Test
    public void testJunit5Remain0() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(expected, actual);
    }
    @Test
    public void testJunit5Remain1000() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }
    @Test
    public void testJunit5Remain1500() {
        int expected = 500;
        int actual = cashbackHackService.remain(1500);

        assertEquals(expected, actual);
    }
    @Test
    public void testJunit5RemainLowerZero() {
        int expected = 1000;
        int actual = cashbackHackService.remain(-1);

        assertEquals(expected, actual);
    }
}