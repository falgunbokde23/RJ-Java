package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<ErrorDetails> categoryExceptionHandler(EmployeeException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> validationExceptionHandler(MethodArgumentNotValidException e){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(e.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorDetails> nullPointerExceptionHandler(NullPointerException e, WebRequest wr){
		
		ErrorDetails er=new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> noHandlerFoundException(NoHandlerFoundException e, WebRequest wr){
		
		ErrorDetails er=new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> masterExceptionHandler(Exception e, WebRequest wr){
		
		ErrorDetails er=new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
}
