package com.cdelateja.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JunitTest {

    @Test
    public void justAnExample() {
        String variable = System.getenv("DISABLE_AUTH");
        System.out.println(variable);
        assertEquals(variable, "true");
    }
}
