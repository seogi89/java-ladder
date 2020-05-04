package com.domain;

import java.util.Random;

public class RandomLineLinkStrategy implements LineLinkStrategy {

    private final Random random = new Random();

    @Override
    public boolean get() {
        return random.nextBoolean();
    }
}
