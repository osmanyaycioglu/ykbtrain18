package com.ykb.java.train.strings;

import java.security.SecureRandom;

public class StrMain {
    public static void main(final String[] args) {
        SecureRandom random = new SecureRandom();
        String str = "osman"
                     + random.nextDouble()
                     + " yyy "
                     + random.nextInt();
        StringBuilder strb = new StringBuilder(200);
        for (int i = 0; i < 1_000; i++) {
            strb.append("test");
            strb.append(random.nextFloat());
            // Yanlış
            str += "test"
                   + random.nextFloat();
        }

        String str2 = String.format("%s dkjflskjdf %d %s",
                                    "osman",
                                    4,
                                    "test");

        System.out.println(str);

        StrMain.methodCallTest("osman"
                               + random.nextDouble()
                               + " yyy "
                               + random.nextInt(),
                               false);
//        if (logger.isDebugEnabled) {
//            logger.debug("osman"
//                         + random.nextDouble()
//                         + " yyy "
//                         + random.nextInt());
//        }
//        logger.debug("%s dkjflskjdf %d %s",
//                     "osman",
//                     4,
//                     "test");
    }

    public static void methodCallTest(final String str,
                                      final boolean check) {
        if (check) {
            str.split(",");
        }

    }
}
