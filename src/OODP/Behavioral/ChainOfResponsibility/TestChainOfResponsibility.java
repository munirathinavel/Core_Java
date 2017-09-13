package OODP.Behavioral.ChainOfResponsibility;

public class TestChainOfResponsibility {

	public static void main(String[] args) {
		Chain chain = new AddChain();
		Chain chain2 = new SubChain();
		Chain chain3 = new MultiplicationChain();
		Chain chain4 = new DivisionChain();

		chain.getNextChain(chain2);
		chain2.getNextChain(chain3);
		chain3.getNextChain(chain4);

		CalculateParameter request = new CalculateParameter(123, 56, "div");
		chain.calculate(request);

		request = new CalculateParameter(123, 56, "add");
		chain.calculate(request);

		request = new CalculateParameter(123, 56, "multi");
		chain.calculate(request);
	}
}
