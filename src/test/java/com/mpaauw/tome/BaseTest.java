package com.mpaauw.tome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseTest {

    // common tests: not null, not empty string, no upper-case, no whitespace
    @Test
    public void testCommon(String contentUnderTest) {
        Pattern uppercasePattern = Pattern.compile("\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).+$\"");
        Matcher uppercaseMatcher = uppercasePattern.matcher(contentUnderTest);
        boolean containsUppercase = uppercaseMatcher.find();

        Assertions.assertNotNull(contentUnderTest);
        Assertions.assertNotEquals("", contentUnderTest);
        Assertions.assertFalse(StringUtils.containsWhitespace(contentUnderTest));
        Assertions.assertFalse(containsUppercase);
    }

}
