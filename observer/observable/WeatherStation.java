package observer.observable;

import java.util.ArrayList;
import java.util.List;

import observer.observer.IObserver;

public class WeatherStation implements IObservable{

    private List<IObserver> devices;

    public WeatherStation(){
        devices = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        devices.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        devices.remove(observer);
    }

    @Override
    public void notifyAllDevices() {
        devices.forEach(observer -> observer.update());
    }
    
    public void getTemprature(){
        System.out.println("New Temp is "+ 100*Math.random());
    }
}
