package fernando.com;

import java.util.Stack;

public class FabriqueExpression  {
	Stack<Expression> stack = new Stack<Expression>();
	
	public Expression batirFromPolonaise(String input) {
		String[] separetedInput = input.split(" ");
		
				
		for (int i = 0; i < separetedInput.length; i++) {
			if(separetedInput[i].equals("+")) {
				 stack.push(new Addition(stack.pop(), stack.pop()));
			} else if(separetedInput[i].equals("-")) {
				stack.push(new Soustraction(stack.pop(), stack.pop()));
			} else if(separetedInput[i].equals("/")) {
				Expression first = stack.pop();
				Expression second = stack.pop();
				stack.push(new Division(second, first));
			} else if(separetedInput[i].equals("*")) {
				 stack.push(new Multiplication(stack.pop(), stack.pop()));				
			} else {
				try {
					stack.push(new Scalaire(Double.parseDouble(separetedInput[i])));
				} catch (NumberFormatException  e) {
					e.printStackTrace();
				}
			}
		}		
		return stack.pop();
	}
}