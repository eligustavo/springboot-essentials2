package com.example.springessentials.exceptions;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class ExceptionDetails {
    protected String title;
    protected int status;
    protected String details;
    protected String developerMessage;
<<<<<<< HEAD
    protected LocalDateTime timestamp;
=======
    protected LocalDateTime timeStamp;
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
}
