/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.database;

import com.ort.arqsistemas.comidasyarest.model.Cliente;
import com.ort.arqsistemas.comidasyarest.model.Restaurante;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diegogroba
 */
public class DatabaseClass {
    
    private static Map<Integer, Cliente> clientes = new HashMap<>();
    private static Map<String, Restaurante> restaurantes = new HashMap<>();

    public static Map<Integer, Cliente> getClientes() {
        return clientes;
    }

    public static Map<String, Restaurante> getRestaurantes() {
        return restaurantes;
    }
    
}
