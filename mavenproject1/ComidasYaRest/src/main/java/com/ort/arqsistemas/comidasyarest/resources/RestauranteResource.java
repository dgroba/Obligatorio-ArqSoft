/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.resources;

import com.ort.arqsistemas.comidasyarest.model.Restaurante;
import com.ort.arqsistemas.comidasyarest.resources.beans.RestauranteFilterBean;
import com.ort.arqsistemas.comidasyarest.service.RestauranteService;
import java.util.List;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author diegogroba
 */
@Path("/restaurantes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestauranteResource {
    
    RestauranteService restauranteService = new RestauranteService();
    
    @GET
    public List<Restaurante> getRestaurantes(@BeanParam RestauranteFilterBean filterBean) {
        if (filterBean.getDireccion() != null){
            return restauranteService.getAllRestaurantesByDireccion(filterBean.getDireccion());
        }
        return restauranteService.getAllRestaurantes();
    }
    
    @GET
    @Path("/{nombreRestaurante}")
    @Produces(MediaType.APPLICATION_JSON)
    public Restaurante getRestaurante(@PathParam("nombreRestaurante") String nombreRestaurante) {
        return restauranteService.getRestaurante(nombreRestaurante);
    }
    
    @POST
    public Restaurante addRestaurante(Restaurante restaurante) {
        return restauranteService.addRestaurante(restaurante);
    }
    
    @PUT
    @Path("/{nombreRestaurante}")
    public Restaurante updateRestaurante(@PathParam("nombreRestaurante") String nombreRestaurante, Restaurante restaurante) {
        restaurante.setNombre(nombreRestaurante);
        return restauranteService.updateRestaurante(restaurante);
    }
    
    @DELETE
    @Path("/{nombreRestaurante}")
    public void deleteRestaurante(@PathParam("nombreRestaurante") String nombreRestaurante) {
        restauranteService.removeRestaurante(nombreRestaurante);
    }
    
}
