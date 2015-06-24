/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.service;

import com.ort.arqsistemas.comidasyarest.database.DatabaseClass;
import com.ort.arqsistemas.comidasyarest.model.Restaurante;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author diegogroba
 */
public class RestauranteService {
    
    private static Map<String, Restaurante> restaurantes = DatabaseClass.getRestaurantes();

    public RestauranteService() {
        restaurantes.put("McDonald's", new Restaurante(1, "McDonald's", "Ellauri", "41112233"));
        restaurantes.put("Subway", new Restaurante(2, "Subway", "18 de Julio", "42223344"));
    }
    
    public List<Restaurante> getAllRestaurantes() {
        return new ArrayList<>(restaurantes.values());
    }
    
    public Restaurante getRestaurante(String nombreRestaurante) {
        return restaurantes.get(nombreRestaurante);
    }
    
    public Restaurante addRestaurante(Restaurante restaurante) {
        restaurante.setId(restaurantes.size() + 1);
        restaurantes.put(restaurante.getNombre(), restaurante);
        return restaurante;
    }
    
    public Restaurante updateRestaurante(Restaurante restaurante) {
        if (restaurante.getNombre().isEmpty()) {
            return null;
        }
        restaurantes.put(restaurante.getNombre(), restaurante);
        return restaurante;
    }
    
    public Restaurante removeRestaurante(String nombreRestaurante) {
        return restaurantes.remove(nombreRestaurante);
    }
    
    public List<Restaurante> getAllRestaurantesByDireccion(String direccion) {
        List<Restaurante> restaurantesByDireccion = new ArrayList<>();
        for (Restaurante restaurante : restaurantes.values()) {
            if (restaurante.getDireccion().equalsIgnoreCase(direccion)) {
                restaurantesByDireccion.add(restaurante);
            }
        }
        return restaurantesByDireccion;
    }
    
}
