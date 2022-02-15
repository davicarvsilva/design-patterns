package decorator;

public class Chocolate extends Decorator{
	public double value = 4;
	
	public Chocolate(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public double cost(){
		return this.beverage.cost() + this.value;
	}
}
