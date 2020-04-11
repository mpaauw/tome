package com.mpaauw.tome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TomeTest {

    private Tome tome;

    @Before
    public void setup() {
        tome = new Tome();
    }

    @Test
    public void testGetValidCommonAdjective() {
        String adjective = tome.adjectives().common();
        Assert.assertNotNull(adjective);
        Assert.assertNotEquals("", adjective);
        Assert.assertFalse(containsWhitespace(adjective));
        Assert.assertFalse(containsUppercase(adjective));    }

    @Test
    public void testGetValidCommonColor() {
        String color = tome.colors().common();
        Assert.assertNotNull(color);
        Assert.assertNotEquals("", color);
        Assert.assertFalse(containsWhitespace(color));
        Assert.assertFalse(containsUppercase(color));    }

    @Test
    public void testGetValidAnimalName() {
        String animal = tome.names().animal();
        Assert.assertNotNull(animal);
        Assert.assertNotEquals("", animal);
        Assert.assertFalse(containsWhitespace(animal));
        Assert.assertFalse(containsUppercase(animal));
    }

    @Test
    public void testGetValidScientistName() {
        String scientist = tome.names().scientist();
        Assert.assertNotNull(scientist);
        Assert.assertNotEquals("", scientist);
        Assert.assertFalse(containsWhitespace(scientist));
        Assert.assertFalse(containsUppercase(scientist));
    }

    private boolean containsWhitespace(String content) {
        return StringUtils.containsWhitespace(content);
    }

    private boolean containsUppercase(String content) {
        Pattern uppercasePattern = Pattern.compile("\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).+$\"");
        Matcher uppercaseMatcher = uppercasePattern.matcher(content);
        return uppercaseMatcher.find();
    }

}
