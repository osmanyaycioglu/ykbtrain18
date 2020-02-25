package com.ykb.java.train.statics;

public class StringUtils {

	public static boolean checkString(final String str) {
		return (str != null) && !str.isEmpty();
	}

	public static String[] splitStr(final String str, final String del) {
		return str.split(del);
	}

}
