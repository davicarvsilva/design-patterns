package observer;

public class Display implements IObserve{
	private WeatherStation ws;
	
	public void setOb(WeatherStation ws) {
		this.ws = ws;
	}
	
	public void update() {
		int data = this.ws.getData();
		System.out.println("Observer updated:" + data);
	}
}
