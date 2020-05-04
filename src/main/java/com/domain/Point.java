package com.domain;

import java.util.Objects;

public class Point {
    private final static LineLinkStrategy DEFAULT_STRATEGY = new RandomLineLinkStrategy();

    private final boolean bridge;

    protected Point(boolean bridge) {
        this.bridge = bridge;
    }

    public static Point first() {
        return first(DEFAULT_STRATEGY);
    }

    public static Point first(LineLinkStrategy strategy) {
        return new Point(strategy.get());
    }

    public Point next() {
        return next(DEFAULT_STRATEGY);
    }

    public Point next(LineLinkStrategy strategy) {
        if(this.bridge)
            return new Point(false);
        return new Point(strategy.get());
    }

    public Point last() {
        return new Point(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return bridge == point.bridge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridge);
    }
}
