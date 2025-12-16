package com.itakademija.third.generic;

/**
 * N je BOUNDED GENERIC TYPE
 * @param <N>
 */
public class NumberBox<N extends Number> {

    private N field;

    public N getField() {
        return field;
    }

    public void setField(N field) {
        this.field = field;
    }
}
