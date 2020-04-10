package com.mpaauw.tome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TomeTest extends BaseTest {

    private Tome tome;

    @BeforeEach
    public void setup() {
        tome = new Tome();
    }

    @Test
    public void testGetValidCommonAdjective() {
        String adjective = tome.adjectives().common();
        this.testCommon(adjective);
    }

    @Test
    public void testGetValidCommonColor() {
        String color = tome.colors().common();
        this.testCommon(color);
    }

    @Test
    public void testGetValidAnimalName() {
        String animal = tome.names().animal();
        this.testCommon(animal);
    }

    @Test
    public void testGetValidScientistName() {
        String scientist = tome.names().scientist();
        this.testCommon(scientist);
    }

}
