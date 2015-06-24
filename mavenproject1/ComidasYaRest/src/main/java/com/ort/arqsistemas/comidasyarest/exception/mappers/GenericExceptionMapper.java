/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.exception.mappers;

import com.ort.arqsistemas.comidasyarest.model.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author diegogroba
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 500);
        return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
    }
    
}
