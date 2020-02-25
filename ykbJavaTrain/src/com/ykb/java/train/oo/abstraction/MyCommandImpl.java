package com.ykb.java.train.oo.abstraction;

public class MyCommandImpl extends BaseCommandImpl {

	@Override
	public String process(final String str) {
		return "Sayın " + str;
	}

}
