public class Duck implements IDuck{
	IQuackBehaviour quackBehaviour;

	public Duck(IQuackBehaviour quack){
		this.quackBehaviour = quack;
	}

	public void quack(){
		this.quackBehaviour.quack();
	}
}