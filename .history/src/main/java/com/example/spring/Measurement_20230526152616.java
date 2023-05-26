package com.example.spring;

import java.util.Arrays;
import java.util.List;

public record Measurement (
    String id,
    String meter,
    String value,
    String timestamp
) {

    private static List<Measurement> measurements = Arrays.asList(
      new Measurement("1", "1", "10.5 C", "2022-03-06T00:00:00Z"),
      new Measurement("2", "1", "11.8 C", "2021-07-02T00:00:00Z"),
      new Measurement("3", "1", "7.4 C", "2022-07-28T00:00:00Z"),
      new Measurement("4", "1", "10.5 C", "2022-03-06T00:00:00Z"),
      new Measurement("5", "2", "11.8 C", "2021-07-02T00:00:00Z"),
      new Measurement("6", "2", "7.4 C", "2022-07-28T00:00:00Z"),
      new Measurement("7", "2", "10.5 C", "2022-03-06T00:00:00Z"),
      new Measurement("8", "3", "11.8 C", "2021-07-02T00:00:00Z"),
      new Measurement("9", "3", "7.4 C", "2022-07-28T00:00:00Z"),
      new Measurement("10", "3", "7.4 C", "2022-07-28T00:00:00Z"),
      new Measurement("11", "3", "7.4 C", "2022-07-28T00:00:00Z"),
      new Measurement("12", "3", "7.4 C", "2022-07-28T00:00:00Z")
    );

    public static Measurement getById(String id) {
      return measurements.stream()
      .filter(measurement -> measurement.id().equals(id))
      .findFirst()
      .orElse(null);
    }

    public static Measurement getReadings(String id) {
      return measurements.stream()
      .filter(measurement -> measurement.meter().equals(id))
      .findFirst()
      .orElse(null);
    }

    public static List<Measurement> getAll() {
      return measurements;
    }
    
}

