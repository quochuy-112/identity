package com.example.demo.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    ENUMKEY_INVALID(1001, "Uncategorized exception"),
    USER_EXISTED(1002, "User already exists"),
    USERNAME_INVALID(1003, "User name must be at least 8 character"),
    PASSWORD_INVALID(1004, "Password must be at least 8 character"),
    USER_NOTEXISTED(1005, "User not exists"),
    UNAUTHENTICATED(1006, "Unauthenticated"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
