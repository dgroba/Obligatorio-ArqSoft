/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;

import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Alvaro Roldan
 */
@Entity
public class Restaurante extends Usuario{
    
    //Variables de Instancia
    
    @OneToOne
    private Menu menu;
    @OneToMany(mappedBy = "restaurante")
    private ArrayList<Promocion> promociones;
    
    //Constructores
    
    public Restaurante() {
    }

    public Restaurante(Menu menu, ArrayList<Promocion> promociones, String email, String nombre, String direccion, int telefono) {
        super(email, nombre, direccion, telefono);
        this.menu = menu;
        this.promociones = promociones;
    }
    
    //Metodos de Aceso y Modificacion
    
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(ArrayList<Promocion> promociones) {
        this.promociones = promociones;
    }
    
    //Otros Metodos
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.menu);
        hash = 43 * hash + Objects.hashCode(this.promociones);
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
        final Restaurante other = (Restaurante) obj;
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        return Objects.equals(this.promociones, other.promociones);
    }

    @Override
    public String toString() {
        return "Restaurante{" + "menu=" + menu + ", promociones=" + promociones + '}';
    }
    
    
    
}
