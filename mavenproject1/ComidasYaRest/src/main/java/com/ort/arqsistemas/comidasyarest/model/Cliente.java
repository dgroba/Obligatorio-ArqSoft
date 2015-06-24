/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.arqsistemas.comidasyarest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author diegogroba
 */
@XmlRootElement
public class Cliente {
    
    private Integer id;
    private String nombre;
    private List<Link> links = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
    
    public void addLink(String uri, String rel) {
        Link link = new Link(uri, rel);
        links.add(link);
    }
    
}
