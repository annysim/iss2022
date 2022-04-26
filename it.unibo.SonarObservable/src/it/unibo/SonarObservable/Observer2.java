package it.unibo.SonarObservable;

import it.unibo.SonarObservable.interfaces.IObserver;
import it.unibo.radarSystem22.domain.interfaces.IDistance;

public class Observer2 implements IObserver{
	private String dist;
	
	public Observer2(String dist) {
		this.dist = dist;
	}

	@Override
	public void update(IDistance d) {
		// TODO Auto-generated method stub
		
	}
	

}
