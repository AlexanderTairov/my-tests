package ru.softrust.docs;

import org.junit.jupiter.api.*;

public class Junit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAlltests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAllTests");
    }

    @BeforeEach
     void beforeEach() {
        System.out.println("Before test!\n");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after test!\n");
    }

    @Test
    void firstTest() {
        System.out.println("I love Ira");
    }

    @Test
    void secondTest() {
        System.out.println("I love dota");
    }
}
