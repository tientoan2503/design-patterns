package observer;

import observer.observers.HumDisplay;
import observer.observers.TempDisplay;
import observer.subjects.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TempDisplay tempDisplay = new TempDisplay(weatherData);
        HumDisplay humDisplay = new HumDisplay(weatherData);

        weatherData.setData(20, 80);
    }
}
