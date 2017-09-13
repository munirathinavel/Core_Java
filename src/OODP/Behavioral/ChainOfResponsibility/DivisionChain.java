package OODP.Behavioral.ChainOfResponsibility;

public class DivisionChain implements Chain {

	Chain nextInChain;

	@Override
	public void getNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(CalculateParameter parameterObject) {
		if (parameterObject.typeOfCalculation.equals("div")) {
			System.out.println("Division: " + parameterObject.num1 + " / " + parameterObject.num2 + " = " + (parameterObject.num1 / parameterObject.num2));
		} else {
			System.out.println("Only Add, div, mul, sub operations are allowed.");
		}
	}
}
