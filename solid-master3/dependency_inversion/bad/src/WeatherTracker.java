/**
 * Created by mrk on 4/8/14.
 */
public class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public void report(Reporter reporter) {
        reporter.generetaWheatherReport(currentConditions);
    }
}
