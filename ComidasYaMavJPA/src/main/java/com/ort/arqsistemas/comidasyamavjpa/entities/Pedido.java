/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyamavjpa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alvaro Roldan
 */
@Entity
public class Pedido extends EntidadPersistente{
    
    //Variables de Instancia
    
    @OneToOne
    private Restaurante restaurant;
    @OneToMany(mappedBy = "pedido")
    private ArrayList<MenuItem> items;
    @Column(nullable = false)
    private float costo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    //Constructores
    
    public Pedido() {
    }

    public Pedido(Restaurante restaurant, ArrayList<MenuItem> items, float costo, Date fecha) {
        this.restaurant = restaurant;
        this.items = items;
        this.costo = costo;
        this.fecha = fecha;
    }
    
    //Metodos de Accesos y Modificacion
    public Restaurante getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurante restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    //Otros Metodos
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.restaurant);
        hash = 17 * hash + Objects.hashCode(this.items);
        hash = 17 * hash + Float.floatToIntBits(this.costo);
        hash = 17 * hash + Objects.hashCode(this.fecha);
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
        final Pedido other = (Pedido) obj;
        if (!Objects.equals(this.restaurant, other.restaurant)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (Float.floatToIntBits(this.costo) != Float.floatToIntBits(other.costo)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        return "Pedido{" + "restaurant=" + restaurant + ", items=" + items + ", costo=" + costo + ", fecha=" + fecha + '}';
    }

    
    
    
}
