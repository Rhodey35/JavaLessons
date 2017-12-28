package com.lessons;

import java.math.BigDecimal;

public class Primitives {

	
	
	
	public static void main(String[] args) {
		// int myInt; // this is not initialized. 
		int myInt = 0;
		System.out.println("The value is set by java as 0 if I do not specify,"
				+ "\nso the number here should be zero: " + myInt + "\n");
		
		
		double doubleValue = 156.5d; // the use of the d is called an alpha character. 
		Double doubleObj = new Double(doubleValue);
		byte byteValue = doubleObj.byteValue();
		int intValue = doubleObj.intValue();
		float floatValue = doubleObj.floatValue();
		String stringValue = doubleObj.toString();
		
		System.out.println("These are the values from the list of variables:\n"
				+ "doubleObj: " + doubleObj + "double can store fractional data\ndoubles give the best procision.\n"
				+ "byteValue: " + byteValue + "\n"
				+ "intValue: " + intValue + "\n"
				+ "floatValue " + floatValue + "float can store fractional data\n"
				+ "stringValue: " + stringValue + " this has been converted to a string value.\n"
				+ "Note that the class library includes helper classes for each of the primitive types\n"
				+ "They help with conversion of types. "
				);
		
		byte b = 1;
		short sh = 1;
		int i = 1;
		long l = 1L;
		float f = 1f;
		double d = 1d;
		
		System.out.println("  Byte: " + b);
		System.out.println(" Short: " + sh);
		System.out.println("   Int: " + i);
		System.out.println("  Long: " + l);
		System.out.println(" Float: " + f);
		System.out.println("double: " + d);
		
		 byte bb = 127;
		 	System.out.println("Byte bb: " + bb);
		 bb++;
		 	System.out.println("Byte bb: " + bb);
		 
		 byte bbb = 127;
		 if (bbb < Byte.MAX_VALUE) {
			 bbb++;
			 
		 }
		 	System.out.println("Byte bb: " + bbb);
		
		double valueA = .012; 
		double pSum = valueA + valueA + valueA;
			System.out.println("Sum of primitives:" + pSum +"\nThis leads to imprisition, so Big decimal is used." );
		//Big decimal is used to address this issue. 
		String strValue = Double.toString(valueA);
			System.out.println("strValue: " + strValue);
		BigDecimal bigValue = new BigDecimal(strValue);
		
		BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
			System.out.println("Sum of BigDecimals: " + bSum.toString());
		 
		 
		
		int intValue1 = 56;
		int intValue2 = intValue1;
		System.out.println("intValue 1 and 2 are pointing to the same space in memory with"
				+ " this value: " + intValue1);
		long longValue1 = intValue1;
		System.out.println("The long value of intValue1 is: " + longValue1);
		
		// to narrow the value use the short
		short shortValue1 = (short) intValue1;
		System.out.println("The short of intValue is: " + shortValue1);
		
		// widening will lose the data, like here in this example
		int intValue3 = 1024;
		/*
		 * Casting is needed to change the type of the variable. 
		 * That is shown here with the (<variable>).
		 */
		byte byteValue3 = (byte) intValue3;
		System.out.println("the byte value is lost, shown here: " + byteValue3);
		
		double doubleValueNarrow = 3.99999999;
		int intValue4 = (int) doubleValueNarrow;
		System.out.println("The narrowed int value of the doubleValueNarrow is: " + intValue4);
		
		
		
		
		
		
		
	}

}
