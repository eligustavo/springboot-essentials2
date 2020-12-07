package com.example.springessentials.handler;

import com.example.springessentials.exceptions.BadRequestException;
import com.example.springessentials.exceptions.BadRequestExceptionDetails;
import com.example.springessentials.exceptions.ExceptionDetails;
import com.example.springessentials.exceptions.ValidationExceptionDetails;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
<<<<<<< HEAD
=======
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@Log4j2
<<<<<<< HEAD
public class RestExceptionHandler {
=======
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handleBadRequestException(BadRequestException bre) {
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
<<<<<<< HEAD
                        .timestamp(LocalDateTime.now())
=======
                        .timeStamp(LocalDateTime.now())
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Check the Documentation")
                        .details(bre.getMessage())
                        .developerMessage(bre.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST);
    }

<<<<<<< HEAD
=======
    @Override
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException exception, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

<<<<<<< HEAD
        String fields = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(", "));
        String fieldsMessage = fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(", "));

        return new ResponseEntity<>(
                ValidationExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
=======
         String fields = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(","));
         String fieldsMessage =  fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(", "));

        return new ResponseEntity<>(
                ValidationExceptionDetails.builder()
                        .timeStamp(LocalDateTime.now())
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Invalid Fields")
                        .details("Check the field(s) error")
                        .developerMessage(exception.getClass().getName())
                        .fields(fields)
                        .fieldsMessage(fieldsMessage)
                        .build(), HttpStatus.BAD_REQUEST);
    }

<<<<<<< HEAD
=======
    @Override
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    protected ResponseEntity<Object> handleExceptionInternal(
            Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {

        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
<<<<<<< HEAD
                .timestamp(LocalDateTime.now())
=======
                .timeStamp(LocalDateTime.now())
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
                .status(status.value())
                .title(ex.getCause().getMessage())
                .details(ex.getMessage())
                .developerMessage(ex.getClass().getName())
                .build();

        return new ResponseEntity<>(exceptionDetails, headers, status);
    }
<<<<<<< HEAD
=======

>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
}
