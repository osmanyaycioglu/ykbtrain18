package com.ykb.java.train.exceptions;

public class MyUserException extends Exception {

    private static final long serialVersionUID = 8700311278063614036L;

    private String msg;
    private int cause;

    public MyUserException(final String msg,
                           final int cause) {
        super();
        this.msg = msg;
        this.cause = cause;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public int getMyCause() {
        return this.cause;
    }

    public void setCause(final int cause) {
        this.cause = cause;
    }

}
