package calculator;

import java.math.BigDecimal;
import parser.DataIO;

public class App {
	public static void main(String []args) {
		String exp = DataIO.readInput();
		String a[] = exp.split(" ");
		BigDecimal x = new BigDecimal(a[0]);
		String operand = in[1];
		BigDecimal y = new BigDecimal(a[2]);
		switch(operand) {
			case "+": DataIO.displayOutput(Operations.add(x, y)); break;
			case "-": DataIO.displayOutput(Operations.subtract(x, y)); break;
			case "*": DataIO.displayOutput(Operations.multiply(x, y)); break;
			case "/": DataIO.displayOutput(Operations.divide(x, y)); break;
		}
	}
}
