package decorator;

public class Cinnamon extends Decorator{
	public double value = 5;
	
	public Cinnamon(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public double cost(){
		return this.beverage.cost() + this.value;
	}
}
