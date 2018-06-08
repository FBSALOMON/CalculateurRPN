package fernando.com;

import java.text.DecimalFormat;

public class Scalaire implements Expression {
	Double scalaire;
	private DecimalFormat df = new DecimalFormat("#.##");
	
	public Scalaire(Double newNumber) {
		this.scalaire = newNumber;
	}

	@Override
	public double evaluer() {
		return scalaire;
	}

	@Override
	public String toInfix() {
		return df.format(scalaire).toString();
	}

	@Override
	public String toPolonaise() {
		// TODO Auto-generated method stub
		return df.format(scalaire).toString();
	}
}