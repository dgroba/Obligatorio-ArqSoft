/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author diegogroba
 */
@Path("/")
public class PedidoResource {
    
    @GET
    public String getAllPedidos(){
        return "new sub resource";
    }
    
    @GET
    @Path("/{pedidoId}")
    public String getPedido(@PathParam("clienteId") int clienteId,
                            @PathParam("pedidoId") int pedidoId){
        return "Cliente Id: " + clienteId + ", Pedido Id: " + pedidoId;
    }
    
}
