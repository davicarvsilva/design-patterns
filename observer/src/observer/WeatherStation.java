package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
	public int num;
	List<IObserve> observers = new ArrayList<IObserve>();
	public void add(IObserve ob) {
		this.observers.add(ob);
	}
	
	public void remove(IObserve ob) {
		this.observers.remove(ob);
	}
	
	public void notifyObservers() {
		for(IObserve ob: this.observers) {
			ob.update();
		}
	}
	
	public int getData() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
		this.notifyObservers();
	}
}
