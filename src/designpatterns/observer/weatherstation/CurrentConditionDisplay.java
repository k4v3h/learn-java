package designpatterns.observer.weatherstation;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    float temperature;
    float humidity;
    private WeatherData weatherData;

    CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();

        display();
    }

    public void display() {
        System.out.println("Current condition: " +
                temperature + "C Degree and " +
                humidity + "% humidity");
    }
}
