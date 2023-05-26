package com.example.spring;

import java.util.Arrays;
import java.util.List;

public record Meter (
  String id, 
  String name, 
  String location, 
  String created, 
  String updated, 
  List<Measurement> readings
) {

    private static List<Meter> meters = Arrays.asList(
      new Meter("1", "Evenrude ACD-38", "Sector 7G", "2022-01-15T00:00:00Z", "2022-03-06T00:00:00Z", List.of()),
      new Meter("2", "Mercury JFH-34", "Sector 1K", "2021-07-01T00:00:00Z", "2021-07-02T00:00:00Z", List.of()),
      new Meter("3", "Jhonson TT64", "Sector 3B", "2022-05-03T00:00:00Z", "2022-07-28T00:00:00Z", List.of())
    );

    public static Meter getById(String id) {
      return meters.stream()
      .filter(meter -> meter.id().equals(id))
      .findFirst()
      .orElse(null);
    }

    public static List<Meter> getAll() {
      return meters;
    }

    public List<Measurement> getMeasurements() {
      return Measurement.getAll();
    }
    
}

