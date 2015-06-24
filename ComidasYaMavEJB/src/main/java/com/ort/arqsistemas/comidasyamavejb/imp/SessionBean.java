/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavejb.imp;

import com.ort.arqsistemas.comidasyamavejb.interfaces.SessionBeanLocal;
import com.ort.arqsistemas.comidasyamavjpa.entities.Cliente;
import com.ort.arqsistemas.comidasyamavjpa.provider.ProviderDatos;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author diegogroba
 */
@Stateless
public class SessionBean implements SessionBeanLocal {

    private ProviderDatos provider;
    
    @Override
    public List<Cliente> obtenerClientes() {
        return provider.obtenerClientes();
    }

}
