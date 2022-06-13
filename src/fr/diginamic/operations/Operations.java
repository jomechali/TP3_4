package fr.diginamic.operations;

public class Operations {

	/**
	 * A method to make basic math operations
	 * @param a first operand
	 * @param b second operand
	 * @param type operation type, ['+','-','*','/'] 
	 * @return
	 */
	public static double Compute(double a, double b, char type) {
		double result = 0.0;
		
		switch (type) {
		case '+':
			result = a + b;
			break;

		case '-':
			result = a - b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			result = a / b;
			break;

		default:
			break;
		}
		
		return result;
	}
}
