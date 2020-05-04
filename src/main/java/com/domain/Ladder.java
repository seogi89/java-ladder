package com.domain;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class Ladder implements Iterable<Line> {

    private final List<Line> lines;

    private Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public static Ladder of(int width, int height) {
        return Stream.generate(() -> Line.of(width))
                .limit(height)
                .collect(collectingAndThen(toList(), Ladder::new));
    }

    public Stream<Line> stream() {
        return lines.stream();
    }

    @Override
    public Iterator<Line> iterator() {
        return lines.iterator();
    }
}
