/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.u3t03.utils;

/**
 *
 * @author alxk
 */
public class Message {
    
    private int code;
    private String message;
    private String detail;

    public Message() {}

    public Message(int code, String message, String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDetail() {
        return detail;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public void build(int code, String message, String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }
}
