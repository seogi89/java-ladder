package com.domain;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Line implements Iterable<Point>{
    private static final int LAST_POINT_DIFFERENCE = 1;
    private static final int LAST_LIST_IDX_DIFFERENCE = 1;

    private final List<Point> points;

    private Line(List<Point> points) {
        this.points = Collections.unmodifiableList(points);
    }

    public static Line of(int width) {
        List<Point> points = Stream.iterate(Point.first(), Point::next)
                .limit(width - LAST_POINT_DIFFERENCE)
                .collect(toList());
        points.add(points.get(points.size() - LAST_LIST_IDX_DIFFERENCE).last());
        return new Line(points);
    }

    public Stream<Point> stream() {
        return points.stream();
    }

    @Override
    public Iterator<Point> iterator() {
        return points.iterator();
    }
}
