package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainReturn0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        assertEquals(actual, expected);

    }

    @Test
    public void testRemainReturn1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainReturn100IfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 100;
        int actual = cashbackHackService.remain(900);
        assertEquals(actual, expected);

    }
}


