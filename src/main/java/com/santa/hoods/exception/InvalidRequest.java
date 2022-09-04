package com.santa.hoods.exception;

/**
 * This {@link InvalidRequest} handles when input request received invalid from caller.
 */
public class InvalidRequest extends RuntimeException{

    public InvalidRequest(String message){
        super(message);
    }
}
