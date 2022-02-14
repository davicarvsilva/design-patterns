public class Main{
	public static void main(String[] args){
		QuackOneTime q1 = new QuackOneTime();
		QuackTwoTimes q2 = new QuackTwoTimes();
		Duck duckOne = new Duck(q1);
		Duck duckTwo = new Duck(q2);

		duckOne.quack();
		duckTwo.quack();
	}
}