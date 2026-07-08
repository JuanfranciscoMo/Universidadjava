package com.morales.rh.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEnotradoExcepcion extends RuntimeException{
    public RecursoNoEnotradoExcepcion(String mensaje) {
        super(mensaje);
    }
}
