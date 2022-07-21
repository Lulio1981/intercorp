package com.intercorp.demo.utils.handler.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class BaseException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7507299805720181309L;
	private String code;
    private String detail;
    private Class context_class;
    private String context;

    public BaseException(String message) {
        super(message);
    }
}
