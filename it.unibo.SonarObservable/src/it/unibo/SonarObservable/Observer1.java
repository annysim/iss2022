package it.unibo.SonarObservable;

import it.unibo.SonarObservable.interfaces.IDistanceMisure;
import it.unibo.SonarObservable.interfaces.IObserver;
import it.unibo.radarSystem22.domain.interfaces.IDistance;

public class Observer1 implements IObserver{
	private String dist;
	private IDistanceMisure ob;
	
	public Observer1(IDistanceMisure ob) {
		this.ob = ob;
	}
	
	public void subscribe() {
		ob.addObserver(this);
	}
	@Override
	public void update(IDistance d) {
		// TODO Auto-generated method stub
		
	}
	
}

/*public void update(Object score) {
    System.out.println("(observer-"+id+")risultato: "+ (String) score);
    this.score = (String) score;
}*/