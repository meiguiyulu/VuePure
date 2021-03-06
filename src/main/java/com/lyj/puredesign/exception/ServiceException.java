package com.lyj.puredesign.exception;

import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class ServiceException extends RuntimeException{

    private String code;
//    private String message;

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
//        this.message = message;
    }
}
