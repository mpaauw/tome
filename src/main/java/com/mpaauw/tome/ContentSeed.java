package com.mpaauw.tome;

import java.util.Random;

public class ContentSeed {

    private static Random random = new Random();

    public static int getRandomIndex(int upperBound) {
        return random.nextInt(upperBound);
    }

}
