/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.resources.beans;

import javax.ws.rs.QueryParam;

/**
 *
 * @author diegogroba
 */
public class RestauranteFilterBean {
    
    private @QueryParam("direccion") String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
