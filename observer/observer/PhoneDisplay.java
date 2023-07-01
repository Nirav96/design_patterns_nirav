package observer.observer;

import observer.observable.WeatherStation;

public class PhoneDisplay implements IObserver{
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        weatherStation.getTemprature();
    }
}
