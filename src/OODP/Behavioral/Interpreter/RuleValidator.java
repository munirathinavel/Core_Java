package OODP.Behavioral.Interpreter;

import java.util.StringTokenizer;

interface AbstractExpression {
	boolean interpret(String str);
}

class TerminalExpression implements AbstractExpression {
	String str;

	public TerminalExpression(String str) {
		this.str = str;
	}

	public boolean interpret(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.equals(this.str)) {
				return true;
			}
		}
		return false;
	}
}

class OrExpression implements AbstractExpression {
	AbstractExpression expression1;
	AbstractExpression expression2;

	public OrExpression(AbstractExpression exp1, AbstractExpression exp2) {
		this.expression1 = exp1;
		this.expression2 = exp2;
	}

	@Override
	public boolean interpret(String str) {
		return expression1.interpret(str) || expression2.interpret(str);
	}
}

class AndExpression implements AbstractExpression {
	AbstractExpression expression1;
	AbstractExpression expression2;

	public AndExpression(AbstractExpression exp1, AbstractExpression exp2) {
		this.expression1 = exp1;
		this.expression2 = exp2;
	}

	@Override
	public boolean interpret(String str) {
		return expression1.interpret(str) && expression2.interpret(str);
	}
}

public class RuleValidator {

		// (Vel or Gomathi) and (Raj or Deepa) -> return true
	static AbstractExpression buildExpressionInterpreterTree() {
		AbstractExpression expression1 = new TerminalExpression("Vel");
		AbstractExpression expression2 = new TerminalExpression("Gomathi");
		AbstractExpression expression3 = new TerminalExpression("Raj");
		AbstractExpression expression4 = new TerminalExpression("Deepa");

		AbstractExpression or1 = new OrExpression(expression1, expression2);
		AbstractExpression or2 = new OrExpression(expression3, expression4);

		return new AndExpression(or1, or2);
	}

	public static void main(String[] args) {
		String context = "Gomathi Deepa";
		AbstractExpression expression = buildExpressionInterpreterTree();
		System.out.println("Result is " + expression.interpret(context));
	}
}
