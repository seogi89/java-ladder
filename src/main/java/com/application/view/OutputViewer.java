package com.application.view;

import com.application.dto.LadderGameResponseView;

import java.util.List;

public class OutputViewer {
    private static final String BLANK = "  ";
    private static final String VERTICAL_LINE = "|      ";
    private static final String HORIZONTAL_LINE = "|------";

    private OutputViewer() {
    }

    public static void printGame(LadderGameResponseView lgrv) {
        printPlayers(lgrv.getPlayers());
        printLadder(lgrv.getLadder());
    }

    private static void printLadder(List<List<Boolean>> ladder) {
        ladder.forEach(line -> {
            line.stream()
            .map(p -> p ? HORIZONTAL_LINE : VERTICAL_LINE)
            .forEach(System.out::print);
            System.out.println();
        });
    }

    public static void printPlayers(List<String> players) {
        players.forEach(name -> System.out.print(String.format("%-5s", name) + BLANK));
        System.out.println();
    }
}
