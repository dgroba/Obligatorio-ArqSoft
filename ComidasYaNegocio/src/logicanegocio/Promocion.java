/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;

import java.util.Objects;

/**
 *
 * @author diegogroba
 */
public class Promocion {
    
    //Variables de Instancia
    
    private TipoComida comida;
    private String descripcion;
    private float precio;
    
    //Constructores
    public Promocion() {
    }

    public Promocion(TipoComida comida, String descripcion, float precio) {
        this.comida = comida;
        this.descripcion = descripcion;
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
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.comida);
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + Float.floatToIntBits(this.precio);
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
        final Promocion other = (Promocion) obj;
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
        return "Promocion{" + "comida=" + comida + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
