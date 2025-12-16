package com.itakademija.third.generic;

/**
 * F, E -> generični tip UNBOUNDED
 *
 *
 *
 * @param <F>
 */
public class Box<F, E> {
    private F field;
    private E element;

    public F getField() {
        return field;
    }

    public void setField(F field) {
        this.field = field;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
