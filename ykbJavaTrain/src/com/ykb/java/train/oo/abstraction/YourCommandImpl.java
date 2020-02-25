package com.ykb.java.train.oo.abstraction;

public class YourCommandImpl extends BaseCommandImpl {

	@Override
	public String process(final String str) {
		return str + " hazretleri";
	}

}
