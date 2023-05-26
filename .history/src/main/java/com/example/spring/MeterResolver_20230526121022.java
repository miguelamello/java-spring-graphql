import com.coxautodev.graphql.tools.GraphQLResolver;

public class MeterResolver implements GraphQLResolver<Meter> {

    public List<Measurement> readings(Meter meter) {
        return meter.getMeasurements();
    }
}
