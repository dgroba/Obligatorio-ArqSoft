/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavjpa.entities;

import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alvaro Roldan
 */
@Entity
public class Cliente extends Usuario {
    
    //Variables de Instancia
    
    @OneToMany(mappedBy = "cliente")
    @XmlTransient
    private ArrayList<Pedido> pedidos;
    
    //Constructores

    public Cliente() {
    }
    
    public Cliente(ArrayList<Pedido> pedidos, String email, String nombre, String direccion, int telefono) {
        super(email, nombre, direccion, telefono);
        this.pedidos = pedidos;
    }
        
    //Metodos de Acceso y Modificacion
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    //Otros Metodos

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.pedidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.pedidos, other.pedidos);
    }

    @Override
    public String toString() {
        return "Cliente{" + "pedidos=" + pedidos + '}';
    }
    
    
 
}
