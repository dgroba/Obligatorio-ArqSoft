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

/**
 *
 * @author Alvaro Roldan
 */
@Entity
public class Menu extends EntidadPersistente{
    
    //Variables de Instancia
    
    @OneToMany(mappedBy = "menu")
    private ArrayList<MenuItem> items;
    
    // Constructores
    
    public Menu() {
    }

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }
    
    //Metodos de Acceso y Modificacion
    
    public ArrayList<MenuItem> getComidas() {
        return items;
    }

    public void setComidas(ArrayList<MenuItem> items) {
        this.items = items;
    }
    
    //Otros Metodos
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.items);
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
        final Menu other = (Menu) obj;
        return Objects.equals(this.items, other.items);
    }

    @Override
    public String toString() {
        return "Menu{" + "comidas=" + items + '}';
    }
    
    
}
