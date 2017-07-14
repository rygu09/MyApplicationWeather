package ustc.gry.com.myapplicationweather.gson;

/**
 * Created by GRY on 2017/7/13.
 */

public class Forecast {

    public String date;

    public Temperature temperature;

    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        public String info;
    }

}
