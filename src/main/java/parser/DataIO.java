package parser;

import java.math.BigDecimal;
import java.util.Scanner;

public class DataIO {
	public static String readInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a expression: ");
		String a=  input.nextLine();
		input.close();
		return a;
	}
	
	public static void displayOutput(BigDecimal result) {
		System.out.println("Result: " + result);
	}
}