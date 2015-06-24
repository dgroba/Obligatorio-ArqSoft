/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author diegogroba
 */
@Path("/injectDemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
    
    @GET
    @Path("annotations")
    public String getParamsUsingAnnotations(@HeaderParam("customHeaderValue") String headerValue,
                                            @CookieParam("cookie") String cookie) {
        return "Header Param: " + headerValue + ", Cookie Param: " + cookie;
    }
    
    @GET
    @Path("context")
    public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {
        return "Path: " + uriInfo.getAbsolutePath().toString() + ", Cookies: " + headers.getCookies().toString();
    }
    
}
