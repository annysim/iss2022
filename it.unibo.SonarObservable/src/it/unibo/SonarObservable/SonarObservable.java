package it.unibo.SonarObservable;

import it.unibo.SonarObservable.interfaces.IObserver;

import java.util.LinkedList;

import it.unibo.SonarObservable.interfaces.IDistanceMisure;
import it.unibo.radarSystem22.domain.interfaces.IDistance;

public class SonarObservable implements IDistanceMisure {
	
	
	private IDistance currDist;
	private LinkedList <IObserver> obList =  new LinkedList<IObserver>();
	@Override
	public void addObserver(IObserver o) {
	obList.add(o);
        
		
	}

	@Override
	public void deleteObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void setVal(IDistance d) {
		currDist = d;
		update();
	}
	private void update() {
		for (IObserver o : obList) {
			o.update(currDist);
		}
	}
}
