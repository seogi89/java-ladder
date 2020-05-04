package com.application;

import com.application.dto.HeightRequestView;
import com.application.dto.LadderGameResponseView;
import com.application.dto.PlayersRequestView;
import com.application.view.InputViewer;
import com.application.view.OutputViewer;
import com.domain.Ladder;
import com.domain.Player;

import java.util.List;

public class LadderGame {

    public static void main(String[] args) {
        PlayersRequestView prv = InputViewer.getPlayers();
        HeightRequestView hrv = InputViewer.getHeight();

        List<Player> players = prv.toPlayers();
        Ladder ladder = Ladder.of(players.size(), hrv.getHeight());

        LadderGameResponseView lgrv = LadderGameResponseView.of(players, ladder);
        OutputViewer.printGame(lgrv);
    }
}
