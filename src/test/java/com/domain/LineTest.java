package com.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class LineTest {

    @Test
    @DisplayName("지정 된 너비 만큼의 포인트를 포함한 라인이 생성 된다.")
    public void of() {
        Line line = Line.of(5);
        assertThat(line.stream().count()).isEqualTo(5);
    }
}