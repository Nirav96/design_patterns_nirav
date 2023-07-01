package observer.observer;

import observer.observable.WeatherStation;

public class LEDDisplay implements IObserver{

    private WeatherStation weatherStation;

    public LEDDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        weatherStation.getTemprature();
    }
    
}
