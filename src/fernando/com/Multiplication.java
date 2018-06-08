package fernando.com;

public class Multiplication implements Expression{
	
	Expression operandeA;
	Expression operandeB;
	
	public Multiplication(Expression a, Expression b) {
		this.operandeA = a;
		this.operandeB = b;
	}

	@Override
	public double evaluer() {
		return operandeA.evaluer() * operandeB.evaluer();
	}

	@Override
	public String toInfix() {
		
		return "(" + operandeA.toInfix() + " * " + operandeB.toInfix() + ")"; 
	}

	@Override
	public String toPolonaise() {
		return operandeA.toPolonaise() + " " + operandeB.toPolonaise() + " *";
	}
}
