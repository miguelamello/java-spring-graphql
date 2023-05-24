package com.example.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record Meter (String id, String name, String location) {

    private static List<Meter> meters = Arrays.asList(
            new Meter("meter-1", "Evenrude ACD-38", "Sector 7G"),
            new Meter("meter-2", "Mercury JFH-34", "Sector 1K"),
            new Meter("meter-3", "Jhonson TT64", "Sector 3B"),
    );

    public static Meter getById(String id) {
        return meters.stream()
				.filter(meter -> meter.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}

