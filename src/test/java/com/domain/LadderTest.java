package com.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {

    @Test
    @DisplayName("지정 된 너비 만큼의 포인트를 포함한 라인이 생성 된다.")
    public void of() {
        Ladder ladder = Ladder.of(5,5);
        assertThat(ladder.stream().count()).isEqualTo(5);
    }
}