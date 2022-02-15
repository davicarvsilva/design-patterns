package decorator;

public class Main {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Chocolate chocolate = new Chocolate(coffee);
		Cinnamon cinnamon = new Cinnamon(chocolate);
		
		System.out.println("Final cost:" + cinnamon.cost());
	}
}
