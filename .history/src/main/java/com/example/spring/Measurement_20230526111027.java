package com.example.spring;

import java.util.Arrays;
import java.util.List;

public record Measurement (
    String id,
    String meter,
    String value,
    String timestamp
) {

    private static List<Measurement> meters = Arrays.asList(
      new Measurement("1", "1", "Sector 7G", "2022-03-06T00:00:00Z"),
      new Measurement("2", "1", "Sector 1K", "2021-07-02T00:00:00Z"),
      new Measurement("3", "Jhonson TT64", "Sector 3B", "2022-07-28T00:00:00Z")
    );

    public static Measurement getById(String id) {
      return meters.stream()
      .filter(meter -> meter.id().equals(id))
      .findFirst()
      .orElse(null);
    }

    public static List<Measurement> getAll() {
      return meters;
    }
    
}

