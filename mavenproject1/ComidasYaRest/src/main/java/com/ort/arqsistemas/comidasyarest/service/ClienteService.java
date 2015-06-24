/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.service;

import com.ort.arqsistemas.comidasyarest.database.DatabaseClass;
import com.ort.arqsistemas.comidasyarest.exception.DataNotFoundException;
import com.ort.arqsistemas.comidasyarest.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author diegogroba
 */
public class ClienteService {
    
    private static Map<Integer, Cliente> clientes = DatabaseClass.getClientes();

    public ClienteService() {
        clientes.put(1, new Cliente(1, "Diego"));
        clientes.put(2, new Cliente(2, "Alvaro"));
    }
    
    public List<Cliente> getAllClientes() {
        return new ArrayList<>(clientes.values());
    }
    
    public Cliente getCliente(Integer id) {
        Cliente cliente = clientes.get(id);
        
        if (cliente == null) {
            throw new DataNotFoundException("Cliente con id: " + id + " no encontrado.");
        }
        
        return cliente;
    }
    
    public Cliente addCliente(Cliente cliente) {
        cliente.setId(clientes.size() + 1);
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }
    
    public Cliente updateCliente(Cliente cliente) {
        if (cliente.getId() <= 0) {
            return null;
        }
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }
    
    public Cliente removeCliente(Integer id) {
        return clientes.remove(id);
    }
    
}
