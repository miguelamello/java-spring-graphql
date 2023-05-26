package com.example.spring;

import org.springframework.graphql.t;
import java.util.List;

public class MeterResolver implements GraphQLResolver<Meter> {

    public List<Measurement> readings(Meter meter) {
        return meter.getMeasurements();
    }
}
