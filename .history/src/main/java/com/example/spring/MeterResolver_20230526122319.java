package com.example.spring;

import org.springframework.stereotype.Component;
import graprhql.kickstart.tools.GraphQLResolve;
import java.util.List;

@Component
public class MeterResolver implements GraphQLResolver<Meter> {

    public List<Measurement> readings(Meter meter) {
        return meter.getMeasurements();
    }
}
