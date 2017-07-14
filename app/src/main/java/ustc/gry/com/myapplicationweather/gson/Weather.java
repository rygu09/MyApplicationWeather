package ustc.gry.com.myapplicationweather.gson;

import java.util.List;

/**
 * Created by GRY on 2017/7/13.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    public List<Forecast> forecastList;
}
