package com.ace.hotel.exception;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.exception
 * @date 2019/11/1 0:13
 */
public class UserAlreadyExistsException extends Exception {

    public UserAlreadyExistsException() {
    }

    UserAlreadyExistsException(String errorMsg) {
        super(errorMsg);
    }
}
