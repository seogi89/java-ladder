package com.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    @DisplayName("이름에 NULL 값이 입력될 경우")
    public void ofNameNull() {
        assertThatIllegalArgumentException().isThrownBy(() -> Player.ofName(null))
                .withMessage("유효하지 않은 이름입니다.");
    }

    @Test
    @DisplayName("이름이 1~5글자를 벗어난 값이 입력될 경우")
    public void ofNameString() {
        assertThatIllegalArgumentException().isThrownBy(() -> Player.ofName(""))
                .withMessage("유효하지 않은 이름입니다.");
        assertThatIllegalArgumentException().isThrownBy(() -> Player.ofName("abcdefg"))
                .withMessage("유효하지 않은 이름입니다.");
    }
}