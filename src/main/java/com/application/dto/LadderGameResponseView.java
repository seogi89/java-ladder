package com.application.dto;

import com.domain.Ladder;
import com.domain.Player;
import com.domain.Point;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class LadderGameResponseView {

    private final List<String> players;
    private final List<List<Boolean>> ladder;

    private LadderGameResponseView(List<String> players, List<List<Boolean>> ladder) {
        this.players = players;
        this.ladder = ladder;
    }

    public static LadderGameResponseView of(List<Player> players, Ladder ladder) {
        List<String> playerView = players.stream()
                .map(Player::getName)
                .collect(toList());
        List<List<Boolean>> ladderView = ladder.stream()
                .map(line -> line.stream()
                             .map(Point::isBridge)
                             .collect(toList())
                ).collect(toList());
        return new LadderGameResponseView(playerView, ladderView);
    }

    public List<String> getPlayers() {
        return players;
    }

    public List<List<Boolean>> getLadder() {
        return ladder;
    }
}
