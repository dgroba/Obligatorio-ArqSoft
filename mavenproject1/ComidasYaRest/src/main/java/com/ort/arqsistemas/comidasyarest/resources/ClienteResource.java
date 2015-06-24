/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.resources;

import com.ort.arqsistemas.comidasyarest.model.Cliente;
import com.ort.arqsistemas.comidasyarest.service.ClienteService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author diegogroba
 */
@Path("/clientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteResource {
    
    ClienteService clienteService = new ClienteService();
    
    @GET
    public List<Cliente> getClientes() {
        return clienteService.getAllClientes();
    }
    
    @GET
    @Path("/{clienteId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente getCliente(@PathParam("clienteId") int clienteId, @Context UriInfo uriInfo) {
        Cliente cliente = clienteService.getCliente(clienteId);
        String uri = uriInfo.getBaseUriBuilder().path(ClienteResource.class).path(Integer.toString(cliente.getId())).build().toString();
        cliente.addLink(uri, "self");
        return cliente;
    }
    
    @POST
    public Cliente addCliente(Cliente cliente) {
        return clienteService.addCliente(cliente);
    }
    
    @PUT
    @Path("/{clienteId}")
    public Cliente updateCliente(@PathParam("clienteId") int clienteId, Cliente cliente) {
        cliente.setId(clienteId);
        return clienteService.updateCliente(cliente);
    }
    
    @DELETE
    @Path("/{clienteId}")
    public void deleteCliente(@PathParam("clienteId") int clienteId) {
        clienteService.removeCliente(clienteId);
    }
    
    @Path("/{clienteId}/pedidos")
    public PedidoResource getPedidoResource() {
        return new PedidoResource();
    }
    
}
