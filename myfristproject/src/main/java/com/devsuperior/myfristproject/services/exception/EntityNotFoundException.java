package com.devsuperior.myfristproject.services.exception;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException (String msg){
        super(msg);
    }
}
