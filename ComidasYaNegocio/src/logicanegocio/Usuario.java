/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Alvaro Roldan
 */
@Entity
@DiscriminatorColumn(name="TIPO", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("PERSONA")
public abstract class Usuario extends EntidadPersistente{
    
    //Variables de Instancia
    
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private int telefono;

    //Constructores
    
    public Usuario() {
    }
    
    public Usuario(String email, String nombre, String direccion, int telefono) {
        this.email = email;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    // Metodos de Acceso y Modificacion

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //Otros Metodos

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        
        return Objects.equals(this.email, other.email);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.email);
        return hash;
    }
  
    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
