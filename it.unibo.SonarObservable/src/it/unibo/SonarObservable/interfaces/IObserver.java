package it.unibo.SonarObservable.interfaces;

import it.unibo.radarSystem22.domain.interfaces.IDistance;

public interface IObserver {
	public void update(IDistance d);
}
