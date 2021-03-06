package com.javarevolutions.jhs.model;
// Generated 25/10/2013 05:03:57 PM by Hibernate Tools 3.2.1.GA



/**
 * Articulos generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private int idArticulo;
     private String nombre;
     private String descripcion;
     private float costo;
     private float precio;

    public Articulo() {
    }

	
    public Articulo(int idArticulo, String nombre, float costo, float precio) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
    }
    public Articulo(int idArticulo, String nombre, String descripcion, float costo, float precio) {
       this.idArticulo = idArticulo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.costo = costo;
       this.precio = precio;
    }
   
    public int getIdArticulo() {
        return this.idArticulo;
    }
    
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getCosto() {
        return this.costo;
    }
    
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }




}


