package observer;

public interface IObservable {
	public void add(IObserve ob);
	public void remove(IObserve ob);
	public void notifyObservers();
	
	public int getData();
}
