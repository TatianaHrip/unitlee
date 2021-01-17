package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainReturn900IfAmount100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 900;
        int actual = cashbackHackService.remain(1000);
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


