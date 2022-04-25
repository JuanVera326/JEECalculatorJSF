package logic;

public class Operations {
	
	public double suma(double num1,  double num2) {
		double sum = num1 + num2;
		return sum;
	}
	
	public double resta(double num1,  double num2) {
		double rest = num1 - num2;
		return rest;
	}
	
	public double multp(double num1,  double num2) {
		double mult = num1 * num2;
		return mult;
	}
	
	public double divs(double num1,  double num2) {
		double div = - 1000;
		if (num2 > 0) {
			div = num1 / num2;
		}
		return div;
	}
}
