package com.store.store.exceptions;

public class RequireIdException extends RuntimeException{
    public RequireIdException(Class clazz, Long id) {
        super("Resource " + clazz.getSimpleName() + " with id " + id + " should exist and be greater than 0.");
    }
}
