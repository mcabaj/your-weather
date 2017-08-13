package com.marekcabaj.domain;

import org.thymeleaf.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum WindDirection {
    EAST,
    WEST,
    NORTH,
    SOUTH;

    private static final List<WindDirection> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static WindDirection randomWindDirection() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    @Override
    public String toString() {
        return StringUtils.capitalize(super.toString());
    }
}
