/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;

import java.util.Objects;

/**
 *
 * @author Alvaro Roldan
 */
public class MenuItem {
    
    //Variables de Instancia
    
    private Restaurante restaurante;
    private TipoComida comida;
    private float precio;
    
    //Constructores
    
    public MenuItem() {
    }

    public MenuItem(Restaurante restaurante, TipoComida comida, float precio) {
        this.restaurante = restaurante;
        this.comida = comida;
        this.precio = precio;
    }
    
    //Metodos de Acceso y Modificacion
    
    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public TipoComida getComida() {
        return comida;
    }

    public void setComida(TipoComida comida) {
        this.comida = comida;
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
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.restaurante);
        hash = 89 * hash + Objects.hashCode(this.comida);
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
        if (!Objects.equals(this.restaurante, other.restaurante)) {
            return false;
        }
        return Objects.equals(this.comida, other.comida);
    }

    @Override
    public String toString() {
        return "MenuItem{" + "restaurante=" + restaurante + ", comida=" + comida + ", precio=" + precio + '}';
    }
    
    
   
  
    
    
    
}
