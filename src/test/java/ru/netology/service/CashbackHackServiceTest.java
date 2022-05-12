package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackIfAmountEquals1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackIfAmountEquals1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackIfAmountEquals1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackIfAmountEquals1000_000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000_000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateCashbackIfAmountEquals0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}