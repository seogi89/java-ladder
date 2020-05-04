package com.application.dto;

import com.domain.Player;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayersRequestView {

    private final String [] names;

    public PlayersRequestView(String [] names) {
        this.names = names;
    }

    public List<Player> toPlayers() {
        return Arrays.stream(this.names)
                .map(Player::ofName)
                .collect(Collectors.toList());
    }
}
