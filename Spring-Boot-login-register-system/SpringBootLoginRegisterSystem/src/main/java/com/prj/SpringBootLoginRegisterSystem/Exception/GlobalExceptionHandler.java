package com.prj.SpringBootLoginRegisterSystem.Exception;

import com.prj.SpringBootLoginRegisterSystem.Dto.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({UserAlreadyRegisteredException.class})
    public ResponseEntity<ErrorDetails> handleUserAlreadyRegisteredException(UserAlreadyRegisteredException e, WebRequest webRequest){
        ErrorDetails details = new ErrorDetails(new Date(), e.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(details, HttpStatus.CONFLICT);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception e, WebRequest webRequest){
        ErrorDetails details = new ErrorDetails(new Date(), e.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
    }
}
