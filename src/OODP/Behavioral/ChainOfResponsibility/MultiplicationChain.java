package OODP.Behavioral.ChainOfResponsibility;

public class MultiplicationChain implements Chain {

	Chain nextInChain;

	@Override
	public void getNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(CalculateParameter parameterObject) {
		if (parameterObject.typeOfCalculation.equals("multi")) {
			System.out.println("MultiplicationChain: " + parameterObject.num1 + " * " + parameterObject.num2 + " = " + (parameterObject.num1 * parameterObject.num2));
		} else {
			nextInChain.calculate(new CalculateParameter(parameterObject.num1, parameterObject.num2, parameterObject.typeOfCalculation));
		}
	}

}
