package com.project.pokedex.util.classes;

import java.util.List;

public class Page<T> {
    public final Integer count;
    public final String next;
    public final String previous;
    public final List<T> results;

    public Page(Integer count, String next, String previous, List<T> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
}
