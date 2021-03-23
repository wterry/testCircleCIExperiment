package com.cdelateja.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JunitTest {

    @Test
    public void justAnExample() {
        String variable = "true";
        System.out.println(variable);
        assertEquals("true", variable);
    }
}
