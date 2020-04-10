package com.mpaauw.tome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseTest {

    // common tests: not null, not empty string, no upper-case, no whitespace
    @Test
    public void testCommon(String contentUnderTest) {
        Pattern whitespacePattern = Pattern.compile("\\s");
        Matcher whitespaceMatcher = whitespacePattern.matcher(contentUnderTest);
        boolean containsWhitespace = whitespaceMatcher.find();

        Pattern uppercasePattern = Pattern.compile("\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).+$\"");
        Matcher uppercaseMatcher = uppercasePattern.matcher(contentUnderTest);
        boolean containsUppercase = uppercaseMatcher.find();

        Assertions.assertNotNull(contentUnderTest);
        Assertions.assertNotEquals("", contentUnderTest);
        Assertions.assertFalse(containsWhitespace);
        Assertions.assertFalse(containsUppercase);
    }

}
