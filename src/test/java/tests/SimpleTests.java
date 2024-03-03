package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTests {

    @Test
    void assertText() {
        var text = "Hello World";
        Assertions.assertEquals(text, "Hello World");
    }

    @Test
    void assertInt() {
        var value = 500;
        Assertions.assertEquals(value, 500);
    }

    @Test
    void assertBoolean() {
        var  booleanValue = true;
        Assertions.assertTrue(booleanValue);
    }

    @Test
    void assertDouble() {
        var doubleValue = 2.5;
        Assertions.assertEquals(doubleValue, 2.5);
    }

    @Test
    void assertTextInCapitalCases() {
        var text = "HELLO WORLD";
        Assertions.assertEquals(text, "HELLO WORLD");
    }
}
