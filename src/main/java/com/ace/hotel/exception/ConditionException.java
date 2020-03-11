package com.ace.hotel.exception;

public class ConditionException extends RuntimeException {
    public ConditionException(String message) {
        super(message);
        System.out.println(message);
    }
}
