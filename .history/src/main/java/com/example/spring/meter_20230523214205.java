package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Meter (String id, String name, int pageCount, String authorId) {

    private static List<Meter> meters = Arrays.asList(
            new Meter("book-1", "Effective Java", 416, "author-1"),
            new Meter("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
            new Meter("book-3", "Down Under", 436, "author-3")
    );

    public static Meter getById(String id) {
        return meters.stream()
				.filter(book -> book.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}

