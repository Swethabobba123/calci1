package calculator;

import java.math.BigDecimal;

public class Operations {
	public static BigDecimal add(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}
	
	public static BigDecimal subtract(BigDecimal x, BigDecimal y) {
		return x.subtract(y);
	}
	
	public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
		return x.multiply(y);
	}
	
	public static BigDecimal divide(BigDecimal x, BigDecimal y) {
		return x.divide(y);
	}
}
