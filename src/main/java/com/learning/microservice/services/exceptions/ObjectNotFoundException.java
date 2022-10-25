package com.learning.microservice.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException() { super("Usuario não encontrado");
    }
}
