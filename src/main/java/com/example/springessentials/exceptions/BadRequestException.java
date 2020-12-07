package com.example.springessentials.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{
<<<<<<< HEAD
    public BadRequestException(String message) {
=======
    public BadRequestException(String message){
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
        super(message);
    }
}
