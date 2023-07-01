package observer.observable;

import observer.observer.IObserver;

public interface IObservable {
    public void add(IObserver iObserver);
    public void remove(IObserver iObserver);
    public void notifyAllDevices();
}