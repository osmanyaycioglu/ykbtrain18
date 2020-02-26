package com.ykb.java.train.enums;

import com.ykb.java.train.oo.abstraction.ICommand;

public class EnumMain {
	public static void main(final String[] args) {
		String str = "RUNNING";
		EMyStats cMyStat = EMyStats.valueOf(str);

		EMyStats eMyStats = EMyStats.END;
		ICommand command = EMyStats.RUNNING;
		System.out.println(command.process("osman"));

		String hello = eMyStats.hello();
		System.out.println(hello);

		int value = eMyStats.getValue();
		if (cMyStat == eMyStats) {
			System.out.println("Equals");
		}

		EMyStats[] values = EMyStats.values();

		switch (eMyStats) {
		case END:
			break;
		case RUNNING:
			break;
		case START:
			break;
		case TEST:
			break;
		default:
			break;
		}

	}

}
