package com.ykb.java.train.enums;

import com.ykb.java.train.oo.abstraction.ICommand;

public enum EMyStats implements ICommand {
	START(100, "Starting system") {
		@Override
		public String hello() {
			return "Merhaba";
		}
	},
	END(200, "Ending system"), RUNNING(300, "Running") {
		@Override
		public String process(final String str) {
			return "Running " + str;
		}
	},
	TEST(400, "Testing");

	private int value;
	private String str;

	private EMyStats(final int value, final String str) {
		this.value = value;
		this.str = str;

	}

	public String hello() {
		return "Hello world";
	}

	public int getValue() {
		return this.value;
	}

	public String getStr() {
		return this.str;
	}

	@Override
	public String process(final String str) {
		return "Hello " + str;
	}

}
