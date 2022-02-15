package decorator;

public abstract class Decorator implements Beverage{
	public Beverage beverage;
	
	public abstract double cost();
}
