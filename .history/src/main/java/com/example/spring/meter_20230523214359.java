package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Meter (String id, String name, String location) {

    private static List<Meter> meters = Arrays.asList(
            new Meter("meter-1", "Effective Java", 416, "author-1"),
            new Meter("meter-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
            new Meter("meter-3", "Down Under", 436, "author-3")
    );

    public static Meter getById(String id) {
        return meters.stream()
				.filter(meter -> meter.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}

