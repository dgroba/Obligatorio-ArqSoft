/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavjpa.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author diegogroba
 */
@Entity
public class TipoComida extends EntidadPersistente{
    
    //Variables de Instancia
    
    @Column(nullable = false)
    private String nombre;
    
    //Constructores
    
    public TipoComida() {
    }

    public TipoComida(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos de Acceso y Modificacion
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Otros Metodos

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final TipoComida other = (TipoComida) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "TipoComida{" + "nombre=" + nombre + '}';
    }
    
    
}
