package datatype;

import java.math.BigInteger;

public class BigNumberType {
	/* ---------------- Big Numbers -------------------
	 * a) BigInteger
	 * b) BigDecimal
	 */
	
	public static void main(String[] args) {
	
		BigInteger a = BigInteger.valueOf(Long.MAX_VALUE); // to store the maximum value of long's or simple big numbers
		BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
		
		BigInteger c = a.add(b);
		System.out.println("Total : " +c);
		
	
	}

}
