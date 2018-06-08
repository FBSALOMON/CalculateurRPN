package fernando.com;

public class MainActivity {
	public static void main(String[] args) {
		Expression a = new Scalaire(5.0);
		Expression b = new Scalaire(6.0);
		Expression c = new Addition(a, b);
		Expression d = new Scalaire(4.0);
		Expression e = new Scalaire(1.0);
		Expression f = new Division(d, e);
		
		Expression exp = new Multiplication(c, f);
		
		
		System.out.println(exp.toInfix());
		System.out.println(exp.toPolonaise());
		
		
		System.out.println("Exemple a)");
		//1 + 2 - 3 * 4 / 5
		
		Expression a1 = new Scalaire(1.0);
		Expression b1 = new Scalaire(2.0);
		Expression c1 = new Addition(a1, b1);
		Expression d1 = new Scalaire(3.0);
		Expression e1 = new Scalaire(4.0);
		Expression f1 = new Multiplication(d1, e1);
		Expression g1 = new Scalaire(5.0);
		Expression h1 = new Division(f1, g1);
		Expression i1 = new Soustraction(c1,h1);
		
		System.out.println(i1.evaluer());
		
		FabriqueExpression hoho = new FabriqueExpression();
		
		Expression aaa = hoho.batirFromPolonaise("1 4 4 + +");
		
		System.out.println(aaa.evaluer());
	}
}