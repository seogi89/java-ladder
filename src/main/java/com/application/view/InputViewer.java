package com.application.view;

import com.application.dto.HeightRequestView;
import com.application.dto.PlayersRequestView;

import java.util.Scanner;

public class InputViewer {
    private static final String INPUT_PLAYERS_MSG ="참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_HEIGHT_MSG ="최대 사다리 높이는 몇 개인가요?";
    private static final Scanner scanner = new Scanner(System.in);

    public static PlayersRequestView getPlayers() {
       System.out.println(INPUT_PLAYERS_MSG);
       return new PlayersRequestView(scanner.nextLine().split(","));
    }

    public static HeightRequestView getHeight() {
       System.out.println(INPUT_HEIGHT_MSG);
       return new HeightRequestView(scanner.next());
    }
}
