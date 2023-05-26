package com.example.spring;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class MeasurementController {
    
  @QueryMapping
  public Measurement getMeasurementById(@Argument String id) {
    return Measurement.getById(id);
  }

  @QueryMapping
  public List<Measurement> getAllMeasurements() {
    return Measurement.getAll();
  }

  @SchemaMapping
  public List<Measurement> readings(Meter meter) {
    return Measurement.getReadings(meter.id());
  }
  
}