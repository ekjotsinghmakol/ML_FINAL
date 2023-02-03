package com.bhavna.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bhavna.exception.EmptyInputException;

@ControllerAdvice
public class MyControllerAdvice {

		@ExceptionHandler(EmptyInputException.class)
		public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException){
			return new ResponseEntity<String>("Empty field", HttpStatus.BAD_REQUEST);
		}
		
		@ExceptionHandler(NoSuchElementException.class)
		public ResponseEntity<String> handleNoSuchElement(NoSuchElementException emptyException){
			return new ResponseEntity<String>(emptyException.getMessage() + "No such element found in db", HttpStatus.NOT_FOUND);
		}
}
