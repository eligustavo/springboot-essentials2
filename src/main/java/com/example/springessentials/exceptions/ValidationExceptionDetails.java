package com.example.springessentials.exceptions;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
<<<<<<< HEAD
public class ValidationExceptionDetails extends ExceptionDetails{
=======
public class ValidationExceptionDetails extends ExceptionDetails {
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    private final String fields;
    private final String fieldsMessage;
}
