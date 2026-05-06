package com.ids.inventario.exception;

public class RecursoNotFoundException extends RuntimeException {
    public RecursoNotFoundException(String mensaje){
        super(mensaje);
    }
}
