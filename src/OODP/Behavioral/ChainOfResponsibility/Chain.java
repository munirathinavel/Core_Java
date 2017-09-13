package OODP.Behavioral.ChainOfResponsibility;

public interface Chain {

	void getNextChain(Chain nextChain);
	
	void calculate(CalculateParameter parameterObject); 

}
