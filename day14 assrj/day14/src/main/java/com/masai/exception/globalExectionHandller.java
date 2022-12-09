package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalExectionHandller {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<myErrorDetails> getStudentException(StudentException e){
		return new ResponseEntity<myErrorDetails>(new myErrorDetails(e.getMessage(),LocalDate.now()), HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<myErrorDetails> gloableExecption(Exception e){
		return new ResponseEntity<myErrorDetails>(new myErrorDetails(e.getMessage(),LocalDate.now()), HttpStatus.BAD_GATEWAY);
	}

}
