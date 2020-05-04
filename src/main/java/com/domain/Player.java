package com.domain;

public class Player {
    private static final int PLAYER_NAME_MAX_LENGTH = 5;
    private static final int PLAYER_NAME_MIN_LENGTH = 1;

    private final String name;

    private Player(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name == null || name.length() < PLAYER_NAME_MIN_LENGTH || name.length() > PLAYER_NAME_MAX_LENGTH)
            throw new IllegalArgumentException("유효하지 않은 이름입니다.");
    }

    public static Player ofName(String name) {
        return new Player(name);
    }

    public String getName() {
        return name;
    }
}
