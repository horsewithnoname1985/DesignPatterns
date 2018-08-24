package chapter2.weatherstation;

public class StatisticsDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }


    public void display() {
        System.out.println("Avg/Min/Max temperature = " + temperature);

    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
}
