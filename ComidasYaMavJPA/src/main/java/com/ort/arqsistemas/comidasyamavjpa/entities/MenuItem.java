/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavjpa.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Alvaro Roldan
 */
@Entity
public class MenuItem extends EntidadPersistente{
    
    //Variables de Instancia
    
    @OneToOne
    private TipoComida comida;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private float precio;
    
    //Constructores
    
    public MenuItem() {
    }

    public MenuItem(TipoComida comida, String descripcion, float precio) {
        this.descripcion = descripcion;
        this.comida = comida;
        this.precio = precio;
    }
    
    //Metodos de Acceso y Modificacion
        
    public TipoComida getComida() {
        return comida;
    }

    public void setComida(TipoComida comida) {
        this.comida = comida;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Otros Metodos

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.comida);
        hash = 61 * hash + Objects.hashCode(this.descripcion);
        hash = 61 * hash + Float.floatToIntBits(this.precio);
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
        final MenuItem other = (MenuItem) obj;
        if (!Objects.equals(this.comida, other.comida)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Float.floatToIntBits(this.precio) == Float.floatToIntBits(other.precio);
    }

    @Override
    public String toString() {
        return "MenuItem{" + "comida=" + comida + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
