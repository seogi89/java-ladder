package com.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    private final static Point BRIDGE = Point.first(()->true);
    private final static Point NOT_BRIDGE = Point.first(()->false);

    @Test
    @DisplayName("마지막 포인트는 항상 브릿지를 가지지 못한다.")
    public void last() {
        assertThat(BRIDGE.last()).isEqualTo(NOT_BRIDGE);
        assertThat(NOT_BRIDGE.last()).isEqualTo(NOT_BRIDGE);
    }

    @Test
    @DisplayName("이전 포인트가 브릿지를 가진다면 다음 포인트는 브릿지를 가지지 못한다.")
    public void next() {
        assertThat(BRIDGE.next()).isEqualTo(NOT_BRIDGE);
    }

    @Test
    @DisplayName("이전 포인트가 브릿지를 가지지 않는다면 다음 포인트는 브릿지를 가질 수 있다.")
    public void next2() {
        assertThat(NOT_BRIDGE.next(()->true)).isEqualTo(BRIDGE);
    }

}