package com.ykb.java.train.lambda;

public class AnonClass {
    public static void main(final String[] args) {
        final String testStr = "skjdsjd";
        IMyInt i = new MyIntImpl();
        String execute = i.execute("osman");
        IMyInt i2 = new IMyInt() {

            @Override
            public String execute(final String str) {
                return "hello "
                       + str
                       + testStr;
            }
        };
        IMyInt i3 = e -> "hello "
                         + e
                         + " hazretleri"
                         + IMyInt.helloStatic("osman");

        IMyInt i4 = e -> {
            StringBuilder b = new StringBuilder();
            b.append("hello ");
            b.append(e);
            b.append(" hazretleri");
            return b.toString();
        };
        IMyInt i5 = AnonClass::methodRef;

        String execute2 = i2.execute("osman");
        String execute3 = i3.execute("osman");
        System.out.println(execute3);
        String execute4 = i4.execute("osman");
        System.out.println(execute4);
        String execute5 = i5.execute("osman");
        System.out.println(execute5);
    }

    public static String methodRef(final String e) {
        StringBuilder b = new StringBuilder();
        b.append("hello ");
        b.append(e);
        b.append(" hazretleri");
        return b.toString();
    }
}
