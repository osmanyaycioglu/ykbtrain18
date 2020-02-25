package com.ykb.java.train.basics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class TypesEx {
	public static void main(String[] args) {
		int intValue = Integer.MAX_VALUE;
		Integer intObjValue = new Integer(50);
		Integer intObjValue2 = 50;
		int test = intObjValue;
		int hh = intObjValue + 30;
		
		long longValue = Long.MAX_VALUE;
		Long longObjValue = 500L;
		Long longObjValue2 = (long)500;
		
		short shortValue = Short.MAX_VALUE;
		Short shortObjValue = 500;
		
		byte byteValue = Byte.MAX_VALUE;
		byte a = 127;
		byte b = (byte)(a + 100);
		byte c = (byte)0x7F;
		System.out.println("Byte sonuç : " + b + " c : " + c);
		
		double doubleValue = 10.13;
		Double doubleObjValue;
		
		float floatValue = 10.13F;
		Float floatObjValue;
		
		BigDecimal bd; 
		BigInteger bi;
		
		char charValue = 'q';
		Character charObjValue = 't';
		
		boolean booleanValue = true;
		Boolean booleanObjValue = false;
		
		Date dateValue = new Date();
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		LocalDate date = LocalDate.now();
	}
}
