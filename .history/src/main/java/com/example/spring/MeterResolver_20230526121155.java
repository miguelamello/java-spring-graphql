package com.example.spring;

import com.coxautodev.graphql.tools.GraphQLResolver;
import java.util.List;

public class MeterResolver implements GraphQLResolver<Meter> {

    public List<Measurement> readings(Meter meter) {
        return meter.getMeasurements();
    }
}
