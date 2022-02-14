package observer;

public class Main {
	public static void main(String[] args) {
		WeatherStation ws = new WeatherStation();
		Display d = new Display();
		ws.add(d);
		
		d.setOb(ws);
		
		ws.setNum(2);
		ws.setNum(3);
	}
}
