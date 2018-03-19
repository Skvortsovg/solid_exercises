/**
 * Created by mrk on 4/8/14.
 */
public class Emailer implements Reporter{
    public void generateWeatherAlert(String weatherConditions) {
        if (weatherConditions == "sunny") {
            System.out.print("It is sunny");
        }
    }
}
