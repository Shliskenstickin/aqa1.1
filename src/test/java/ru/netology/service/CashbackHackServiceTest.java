package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void testRemain0() {
        int actual = cashback.remain(0);
        int expected = 1000;

        assertEquals(actual, expected, "remain if 0");
    }
    @Test
    public void testRemain1000() {
        int actual = cashback.remain(1000);
        int expected = 0;

        assertEquals(actual, expected, "remain if 1000");
    }
    @Test
    public void testRemain1500() {
        int actual = cashback.remain(1500);
        int expected = 500;

        assertEquals(actual, expected, "remain if 1500");
    }
    @Test
    public void testRemainLowerZero() {
        int actual = cashback.remain(-1);
        int expected = 1000;

        assertEquals(actual, expected, "remain if -1");
    }
}