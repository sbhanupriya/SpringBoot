package com.example.springboot.error;

public class EmployeeNotFoundException extends  RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
