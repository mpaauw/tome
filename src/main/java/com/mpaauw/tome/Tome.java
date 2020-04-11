package com.mpaauw.tome;

public class Tome {

    private final Adjectives adjectives;
    private final Colors colors;
    private final Names names;

    public Tome() {
        this.adjectives = new Adjectives(this);
        this.colors = new Colors(this);
        this.names = new Names(this);
    }

    public Adjectives adjectives() {
        return adjectives;
    }

    public Colors colors() {
        return colors;
    }

    public Names names() {
        return names;
    }

}
