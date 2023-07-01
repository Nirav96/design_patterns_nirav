package observer;

import observer.observable.WeatherStation;
import observer.observer.LEDDisplay;
import observer.observer.PhoneDisplay;

public class Test {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        LEDDisplay ledDisplay = new LEDDisplay(station);

        station.add(phoneDisplay);
        station.add(ledDisplay);
        
        station.notifyAllDevices();
    }
}
