/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavjpa.provider;

import com.ort.arqsistemas.comidasyamavjpa.controllers.ClienteJpaController;
import com.ort.arqsistemas.comidasyamavjpa.entities.Cliente;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author diegogroba
 */
public abstract class ProviderDatos {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.ort.arqsistemas_ComidasYaMavJPA_jar_1.0-SNAPSHOTPU");
    ClienteJpaController clienteController = new ClienteJpaController(emf);
    
    public List<Cliente> obtenerClientes() {
        List<Cliente> clientes = clienteController.findClienteEntities();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
