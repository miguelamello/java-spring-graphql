package com.example.spring;

import org.springframework.stereotype.Component;
import graphql.kickstart.tools.GraphQLResolver;
import java.util.List;

public class MeterResolver implements GraphQLResolver<Meter> {

    public List<Measurement> readings(Meter meter) {
        return meter.getMeasurements();
    }
}
