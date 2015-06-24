/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavejb.interfaces;

import com.ort.arqsistemas.comidasyamavjpa.entities.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diegogroba
 */
@Local
public interface SessionBeanLocal {
    
    List<Cliente> obtenerClientes();
    
}
