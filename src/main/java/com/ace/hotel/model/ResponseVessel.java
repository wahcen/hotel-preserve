package com.ace.hotel.model;

import java.io.Serializable;

/**
 * 返回ajax异步请求结果
 *
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.model
 * @date 2019/10/31 18:21
 */
public class ResponseVessel<T> implements Serializable {
    private Integer state;
    private String message;
    private T data;

    public ResponseVessel() {

    }

    public ResponseVessel(Integer state, String message) {
        super();
        this.state = state;
        this.message = message;
    }

    public ResponseVessel(Integer state, String message, T data) {
        super();
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
