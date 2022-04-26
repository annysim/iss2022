package it.unibo.SonarObservable.interfaces;

import it.unibo.radarSystem22.domain.interfaces.IDistance;

public interface IDistanceMisure {
	public void addObserver(IObserver o);
    public void deleteObserver(IObserver o);
    public void setVal(IDistance d);
    //public void notificationObservers(IDistance d);
}
